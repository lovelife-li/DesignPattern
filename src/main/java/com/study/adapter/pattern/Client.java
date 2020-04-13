package com.study.adapter.pattern;

/**
 * @author ldb
 * @date 2019-11-08 14:56
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();

    }
}
