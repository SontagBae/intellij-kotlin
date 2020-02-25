/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.cli.common.config.ContentRootsKt;
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles;
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment;
import org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.jetbrains.kotlin.config.JVMConfigurationKeys;
import org.jetbrains.kotlin.parsing.KotlinParserDefinition;
import org.jetbrains.kotlin.resolve.DescriptorUtils;
import org.jetbrains.kotlin.test.*;
import org.jetbrains.kotlin.test.KotlinBaseTest;

import java.io.File;
import java.util.*;

import static org.jetbrains.kotlin.script.ScriptTestUtilKt.loadScriptingPlugin;

public abstract class KotlinMultiFileTestWithJava<M extends KotlinBaseTest.TestModule, F extends KotlinBaseTest.TestFile> extends KotlinBaseTest<F> {
    protected File javaFilesDir;
    private File kotlinSourceRoot;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // TODO: do not create temporary directory for tests without Java sources
        javaFilesDir = KotlinTestUtils.tmpDir("java-files");
        if (isKotlinSourceRootNeeded()) {
            kotlinSourceRoot = KotlinTestUtils.tmpDir("kotlin-src");
        }
    }

    public class ModuleAndDependencies {
        final M module;
        final List<String> dependencies;
        final List<String> friends;

        ModuleAndDependencies(M module, List<String> dependencies, List<String> friends) {
            this.module = module;
            this.dependencies = dependencies;
            this.friends = friends;
        }
    }

    @NotNull
    private static Boolean isScriptingNeeded(@NotNull File file) {
        return file.getName().endsWith(KotlinParserDefinition.STD_SCRIPT_EXT);
    }

    @Override
    @NotNull
    public List<F> createTestFilesFromFile(@NotNull File file, String expectedText) {
        return createTestFiles(file, expectedText, new HashMap<>());
    }

    @NotNull
    protected KotlinCoreEnvironment createEnvironment(
            @NotNull File file,
            @NotNull List<TestFile> files
    ) {
        CompilerConfiguration configuration = KotlinTestUtils.newConfiguration(
                getConfigurationKind(),
                getTestJdkKind(files),
                getClasspath(file),
                isJavaSourceRootNeeded() ? Collections.singletonList(javaFilesDir) : Collections.emptyList()
        );
        if (isScriptingNeeded(file)) {
            loadScriptingPlugin(configuration);
        }
        if (isKotlinSourceRootNeeded()) {
            ContentRootsKt.addKotlinSourceRoot(configuration, kotlinSourceRoot.getPath());
        }

        // Currently, we're testing IDE behavior when generating the .txt files for comparison, but this can be changed.
        // The main difference is the fact that the new class file reading implementation doesn't load parameter names from JDK classes.
        configuration.put(JVMConfigurationKeys.USE_PSI_CLASS_FILES_READING, true);

        performCustomConfiguration(configuration);
        return KotlinCoreEnvironment.createForTests(getTestRootDisposable(), configuration, getEnvironmentConfigFiles());
    }

    protected boolean isJavaSourceRootNeeded() {
        return true;
    }

    protected void performCustomConfiguration(@NotNull CompilerConfiguration configuration) {

    }

    protected void setupEnvironment(@NotNull KotlinCoreEnvironment environment) {

    }

    protected void setupEnvironment(@NotNull KotlinCoreEnvironment environment,@NotNull File testDataFile, @NotNull List<BaseDiagnosticsTest.TestFile> files) {
        setupEnvironment(environment);
    }

    @NotNull
    protected ConfigurationKind getConfigurationKind() {
        return ConfigurationKind.JDK_ONLY;
    }

    private List<File> getClasspath(File file) {
        List<File> result = new ArrayList<>();
        result.add(KotlinTestUtils.getAnnotationsJar());
        result.addAll(getExtraClasspath());

        String fileText = FilesKt.readText(file, Charsets.UTF_8);

        if (InTextDirectivesUtils.isDirectiveDefined(fileText, "ANDROID_ANNOTATIONS")) {
            result.add(ForTestCompileRuntime.androidAnnotationsForTests());
        }
        if (InTextDirectivesUtils.isDirectiveDefined(fileText, "STDLIB_JDK8")) {
            result.add(ForTestCompileRuntime.runtimeJarForTestsWithJdk8());
        }

        if (DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.asString().equals(coroutinesPackage) ||
            fileText.contains(DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.asString())) {
            result.add(ForTestCompileRuntime.coroutinesCompatForTests());
        }

        return result;
    }

    @NotNull
    protected List<File> getExtraClasspath() {
        return Collections.emptyList();
    }

    @NotNull
    protected EnvironmentConfigFiles getEnvironmentConfigFiles() {
        return EnvironmentConfigFiles.JVM_CONFIG_FILES;
    }

    protected boolean isKotlinSourceRootNeeded() {
        return false;
    }

    @NotNull
    protected File createTestFileFromPath(@NotNull String filePath) {
        return new File(filePath);
    }

    @Override
    protected void doTest(@NotNull String filePath) throws Exception {
        File file = createTestFileFromPath(filePath);
        String expectedText = KotlinTestUtils.doLoadFile(file);
        //TODO: move to proper tests
        if (InTextDirectivesUtils.isDirectiveDefined(expectedText, "// SKIP_JAVAC")) return;

        super.doTest(file.getPath());
    }

    protected abstract M createTestModule(@NotNull String name, List<String> dependencies, List<String> friends);

    protected abstract F createTestFile(M module, String fileName, String text, Map<String, String> directives);

    protected List<F> createTestFiles(File file, String expectedText, Map<String, ModuleAndDependencies> modules) {
        return TestFiles.createTestFiles(file.getName(), expectedText, new TestFiles.TestFileFactory<M, F>() {
            @Override
            public F createFile(
                    @Nullable M module,
                    @NotNull String fileName,
                    @NotNull String text,
                    @NotNull Map<String, String> directives
            ) {
                if (fileName.endsWith(".java")) {
                    writeSourceFile(fileName, text, javaFilesDir);
                }

                if ((fileName.endsWith(".kt") || fileName.endsWith(".kts")) && kotlinSourceRoot != null) {
                    writeSourceFile(fileName, text, kotlinSourceRoot);
                }

                return createTestFile(module, fileName, text, directives);
            }

            @Override
            public M createModule(@NotNull String name, @NotNull List<String> dependencies, @NotNull List<String> friends) {
                M module = createTestModule(name, dependencies, friends);
                ModuleAndDependencies oldValue = modules.put(name, new ModuleAndDependencies(module, dependencies, friends));
                assert oldValue == null : "Module " + name + " declared more than once";

                return module;
            }

            private void writeSourceFile(@NotNull String fileName, @NotNull String content, @NotNull File targetDir) {
                File file = new File(targetDir, fileName);
                KotlinTestUtils.mkdirs(file.getParentFile());
                FilesKt.writeText(file, content, Charsets.UTF_8);
            }
        }, coroutinesPackage);
    }

}