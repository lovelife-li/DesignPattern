package com.study.builder.pattern;

/**
 * @author ldb
 * @date 2019-09-25 14:18
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
