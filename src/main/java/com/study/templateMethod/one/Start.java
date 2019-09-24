package com.study.templateMethod.one;

/**
 * @author ldb
 * @date 2019-09-24 16:10
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("学生甲抄写的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestionl();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生乙抄写的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestionl();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
