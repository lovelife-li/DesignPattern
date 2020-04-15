package com.study.Mediator.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 美国
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.delare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
