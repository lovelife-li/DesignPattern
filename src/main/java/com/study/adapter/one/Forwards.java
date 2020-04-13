package com.study.adapter.one;

/**
 * @author ldb
 * @date 2019-11-08 15:04
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋%s进攻\n",name);
    }

    @Override
    public void defense() {
        System.out.printf("前锋%s防守\n",name);
    }
}
