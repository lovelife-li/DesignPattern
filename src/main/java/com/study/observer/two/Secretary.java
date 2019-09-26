package com.study.observer.two;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2019-09-25 14:37
 */
@Data
public class Secretary {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    // 增加
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 减少
    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 通知
    public void myNotify(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
