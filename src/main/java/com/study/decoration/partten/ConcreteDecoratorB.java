package com.study.decoration.partten;

/**
 * @author ldb
 * @date 2019-09-23 14:16
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private  void addedBehavior(){

    }
}
