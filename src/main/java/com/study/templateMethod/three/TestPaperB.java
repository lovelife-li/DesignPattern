package com.study.templateMethod.three;


/**
 * @author ldb
 * @date 2019-09-24 16:17
 */
public class TestPaperB extends TestPaper {
    @Override
    protected String answer1() {
        return "b";
    }

    @Override
    protected String answer2() {
        return "c";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}
