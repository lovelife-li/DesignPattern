package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:53
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.printf("当前时间：%s点 不行了，睡着了。", w.getHour());
        System.out.println();
    }
}
