package com.study.observer.three;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2019-09-25 15:19
 */
public class Boss extends Subject {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void mynotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // 老板状态
    public String state;
}
