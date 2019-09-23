package com.study.proxy.parttern;

/**
 * @author ldb
 * @date 2019-09-23 16:20
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
