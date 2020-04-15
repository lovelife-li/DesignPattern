package com.study.Mediator.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 同事2
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void mynotifiy(String message) {
        System.out.println("同事2得到信息：" + message);
    }
}
