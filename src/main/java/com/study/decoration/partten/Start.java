package com.study.decoration.partten;

/**
 * @author ldb
 * @date 2019-09-23 14:23
 */
public class Start {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(c);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();



    }
}
