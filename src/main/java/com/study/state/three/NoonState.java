package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:29
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.printf("当前时间：%s点，饿了，午饭;犯困，午休", w.getHour());
            System.out.println();
        } else {
            w.setState(new AfternoonState());

            w.writeProgram();
        }
    }
}
