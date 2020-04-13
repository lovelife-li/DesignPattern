package com.study.adapter.pattern;

/**
 * @author ldb
 * @date 2019-11-08 14:45
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificrequest();
    }
}
