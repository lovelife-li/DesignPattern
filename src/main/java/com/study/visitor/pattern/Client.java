package com.study.visitor.pattern;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        o.accept(v1);


    }
}
