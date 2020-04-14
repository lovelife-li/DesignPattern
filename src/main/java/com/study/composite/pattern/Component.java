package com.study.composite.pattern;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 组件抽象
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
