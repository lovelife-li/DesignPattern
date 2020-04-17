package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
