package com.study.singleton.five;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 枚举，线程安全
 */
public enum Singleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("hello,world");
    }

    public static void main(String[] args) {
        Singleton.INSTANCE.doSomething();
    }
}
