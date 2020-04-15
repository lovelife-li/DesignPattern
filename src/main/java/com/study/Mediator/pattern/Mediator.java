package com.study.Mediator.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 抽象中介者
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
