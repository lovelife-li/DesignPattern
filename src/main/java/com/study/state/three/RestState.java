package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:52
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.printf("当前时间：%s点 下班回家了", w.getHour());
        System.out.println();
    }
}
