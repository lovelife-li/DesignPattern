package com.study.state.three;

/**
 * @author ldb
 * @date 2019-09-26 10:22
 */
public class Work {
    private State current;

    public Work(){
        current = new ForenoonState();
    }

    private double hour;
    private boolean taskFinished;

    public void setState(State s){
        current = s;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }
}
