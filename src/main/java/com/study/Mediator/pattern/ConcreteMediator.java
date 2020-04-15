package com.study.Mediator.pattern;

import lombok.Setter;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 具体中介者
 */
@Setter
public class ConcreteMediator extends Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.mynotifiy(message);
        } else {
            colleague1.mynotifiy(message);
        }
    }
}
