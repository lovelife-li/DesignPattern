package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
