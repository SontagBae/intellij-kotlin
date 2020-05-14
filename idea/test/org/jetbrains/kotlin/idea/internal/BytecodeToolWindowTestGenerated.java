/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.internal;

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
@TestMetadata("idea/testData/internal/toolWindow")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeToolWindowTestGenerated extends AbstractBytecodeToolWindowTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresent() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/internal/toolWindow"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("componentInlineFun")
    public void testComponentInlineFun() throws Exception {
        runTest("idea/testData/internal/toolWindow/componentInlineFun/");
    }

    @TestMetadata("inlineFunctionBodyResolve")
    public void testInlineFunctionBodyResolve() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineFunctionBodyResolve/");
    }

    @TestMetadata("inlineFunctionDeep1")
    public void testInlineFunctionDeep1() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineFunctionDeep1/");
    }

    @TestMetadata("inlineFunctionDeep2")
    public void testInlineFunctionDeep2() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineFunctionDeep2/");
    }

    @TestMetadata("inlineFunctionInfixCall")
    public void testInlineFunctionInfixCall() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineFunctionInfixCall/");
    }

    @TestMetadata("inlineFunctionReifiedParam")
    public void testInlineFunctionReifiedParam() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineFunctionReifiedParam/");
    }

    @TestMetadata("inlineProperty")
    public void testInlineProperty() throws Exception {
        runTest("idea/testData/internal/toolWindow/inlineProperty/");
    }

    @TestMetadata("iteratorFun")
    public void testIteratorFun() throws Exception {
        runTest("idea/testData/internal/toolWindow/iteratorFun/");
    }

    @TestMetadata("multipleInlineFunctionCalls")
    public void testMultipleInlineFunctionCalls() throws Exception {
        runTest("idea/testData/internal/toolWindow/multipleInlineFunctionCalls/");
    }

    @TestMetadata("objectInInlineFun")
    public void testObjectInInlineFun() throws Exception {
        runTest("idea/testData/internal/toolWindow/objectInInlineFun/");
    }
}
