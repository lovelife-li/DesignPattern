package com.study.singleton.one;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1==s2){
            System.out.println("实例相同");
        }
    }
}
