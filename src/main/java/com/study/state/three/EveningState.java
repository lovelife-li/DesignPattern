package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:31
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {

        if (w.isTaskFinished()){
            w.setState(new RestState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21) {
                System.out.printf("当前时间：%s点 加班哦，疲累之极", w.getHour());
                System.out.println();
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }

    }
}
