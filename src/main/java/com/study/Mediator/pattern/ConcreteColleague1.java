package com.study.Mediator.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 同事1
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
    @Override
    public void mynotifiy(String message) {
        System.out.println("同事1得到信息：" + message);
    }

}
