package com.study.Mediator.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void mynotifiy(String message);
}
