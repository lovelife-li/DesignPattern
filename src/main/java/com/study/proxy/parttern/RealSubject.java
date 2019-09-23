package com.study.proxy.parttern;

/**
 * @author ldb
 * @date 2019-09-23 16:19
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
