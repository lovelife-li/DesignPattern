package com.study.Mediator.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 伊拉克
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.delare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
