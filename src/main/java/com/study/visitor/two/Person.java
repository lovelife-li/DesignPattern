package com.study.visitor.two;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 抽象人类
 */
public abstract class Person {

    /**
     * 接受
     * @param visitor
     */
    public abstract void accept(Action visitor);

}
