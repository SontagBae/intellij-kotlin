/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.navigation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestMetadata("idea/testData/navigation/gotoDeclaration")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class GotoDeclarationTestGenerated extends AbstractGotoDeclarationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresent() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/navigation/gotoDeclaration"), Pattern.compile("^(.+)\\.test$"), null, true);
    }

    @TestMetadata("importAlias.test")
    public void testImportAlias() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/importAlias.test");
    }

    @TestMetadata("importAliasMultiDeclarations.test")
    public void testImportAliasMultiDeclarations() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/importAliasMultiDeclarations.test");
    }

    @TestMetadata("itExtensionLambda.test")
    public void testItExtensionLambda() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/itExtensionLambda.test");
    }

    @TestMetadata("itExtensionLambdaInBrackets.test")
    public void testItExtensionLambdaInBrackets() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/itExtensionLambdaInBrackets.test");
    }

    @TestMetadata("itInLambdaAsDefaultArgument.test")
    public void testItInLambdaAsDefaultArgument() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/itInLambdaAsDefaultArgument.test");
    }

    @TestMetadata("itInLambdaWithoutCall.test")
    public void testItInLambdaWithoutCall() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/itInLambdaWithoutCall.test");
    }

    @TestMetadata("itParameterInLambda.test")
    public void testItParameterInLambda() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/itParameterInLambda.test");
    }

    @TestMetadata("labeledThisToClass.test")
    public void testLabeledThisToClass() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/labeledThisToClass.test");
    }

    @TestMetadata("labeledThisToMemberExtension.test")
    public void testLabeledThisToMemberExtension() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/labeledThisToMemberExtension.test");
    }

    @TestMetadata("thisExtensionFunction.test")
    public void testThisExtensionFunction() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/thisExtensionFunction.test");
    }

    @TestMetadata("thisExtensionLambda.test")
    public void testThisExtensionLambda() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/thisExtensionLambda.test");
    }

    @TestMetadata("thisInExtensionPropertyAccessor.test")
    public void testThisInExtensionPropertyAccessor() throws Exception {
        runTest("idea/testData/navigation/gotoDeclaration/thisInExtensionPropertyAccessor.test");
    }
}
