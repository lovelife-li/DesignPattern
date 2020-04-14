package com.study.singleton.two;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 双重检查安全单例
 */
public class Singleton {

    public static volatile Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
