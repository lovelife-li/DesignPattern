package com.study.strategy.parttern;

/**
 * @author ldb
 * @date 2019-09-23 15:07
 */
public class Start {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
