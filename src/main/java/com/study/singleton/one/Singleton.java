package com.study.singleton.one;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 不安全单例
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
