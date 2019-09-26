package com.study.observer.one;

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
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    // 增加
    public void attach(StockObserver observer){
        observers.add(observer);
    }

    // 通知
    public void myNotify(){
        for (StockObserver observer : observers) {
            observer.update();
        }
    }
}
