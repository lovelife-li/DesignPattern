package com.study.builder.two;

import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 13:53
 */
public abstract class PersonBuilder {
    protected Graphics g;
    protected Color c;

    public PersonBuilder(Graphics g, Color c) {
        this.g = g;
        this.c = c;
        g.setColor(c);
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();
}
