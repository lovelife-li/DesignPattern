package com.study.bridge.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public abstract class Abstration {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * operation
     */
    public abstract void operation();
}
