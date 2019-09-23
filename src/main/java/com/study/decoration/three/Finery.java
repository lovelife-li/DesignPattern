package com.study.decoration.three;

/**
 * @author ldb
 * @date 2019-09-23 14:39
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
