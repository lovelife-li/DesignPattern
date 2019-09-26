package com.study.observer.two;

import lombok.AllArgsConstructor;

/**
 * @author ldb
 * @date 2019-09-25 14:52
 */
@AllArgsConstructor
public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public abstract void update();
}
