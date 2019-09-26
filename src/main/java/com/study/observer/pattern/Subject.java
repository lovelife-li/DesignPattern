package com.study.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2019-09-25 16:01
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void mynotify(){
        for (Observer observer : observers) {
            observer.update();
        } 
    }
}
