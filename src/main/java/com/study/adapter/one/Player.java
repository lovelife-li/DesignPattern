package com.study.adapter.one;

/**
 * 球员
 * @author ldb
 * @date 2019-11-08 15:01
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }
    public Player(){}

    public abstract void attack();
    public abstract void defense();
}
