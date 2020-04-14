package com.study.iterator;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 抽象类
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
