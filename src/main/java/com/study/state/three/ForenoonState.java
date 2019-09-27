package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:26
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.printf("当前时间：%s点 上午工作，精神百倍", w.getHour());
            System.out.println();
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
