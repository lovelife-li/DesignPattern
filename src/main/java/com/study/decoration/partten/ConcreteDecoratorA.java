package com.study.decoration.partten;

/**
 * @author ldb
 * @date 2019-09-23 14:09
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");

    }
}
