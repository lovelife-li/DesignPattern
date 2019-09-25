package com.study.Facade.pattern;

/**
 * @author ldb
 * @date 2019-09-25 11:27
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();

    }
}
