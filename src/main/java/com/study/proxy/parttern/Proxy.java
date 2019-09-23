package com.study.proxy.parttern;

/**
 * @author ldb
 * @date 2019-09-23 16:19
 */
public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject==null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
