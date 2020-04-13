package com.study.adapter.one;

/**
 * @author ldb
 * @date 2019-11-08 15:04
 */
public class Guards extends Player {
    @Override
    public void attack() {
        System.out.printf("后锋%s进攻\n",name);
    }

    @Override
    public void defense() {
        System.out.printf("后锋%s防守\n",name);
    }

    public Guards(String name) {
        super(name);
    }
}
