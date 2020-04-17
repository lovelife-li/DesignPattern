package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.printf("%s被%s访问", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.printf("%s被%s访问", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }
}
