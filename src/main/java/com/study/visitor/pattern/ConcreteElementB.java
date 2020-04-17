package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationA(){

    }
}
