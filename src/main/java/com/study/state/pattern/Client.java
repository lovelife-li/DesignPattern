package com.study.state.pattern;

/**
 * @author ldb
 * @date 2019-09-26 10:15
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();
    }
}
