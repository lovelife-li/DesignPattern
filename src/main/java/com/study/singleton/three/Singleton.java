package com.study.singleton.three;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 静态初始化单例
 * 饿汉模式的线程安全通过类加载解决同步问题，但没有达到懒加载目的。 不好
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
