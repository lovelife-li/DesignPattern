package com.study.templateMethod.two;

/**
 * @author ldb
 * @date 2019-09-24 16:17
 */
public class TestPaperB extends TestPaper {
    @Override
    public void testQuestionl() {
        super.testQuestionl();
        System.out.println("答案：a");
    }

    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("答案：b");
    }

    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("答案：c");
    }
}
