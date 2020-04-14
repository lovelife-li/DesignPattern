package com.study.singleton.four;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 静态内部类模式
 * 延迟初始化。调用getSingleton才初始化Singleton对象。 很好
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return Inner.instance;
    }

    private static class Inner {
        private static final Singleton instance = new Singleton();
    }
}
