package com.study.command.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand c = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();


        invoker.setCommand(c);
        invoker.execCommand();
    }
}
