package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description ??
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA(){

    }
}
