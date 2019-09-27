package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:30
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.printf("当前时间：%s点，下午状态还不错，继续努力", w.getHour());
            System.out.println();
        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
