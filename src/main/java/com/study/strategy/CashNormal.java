package com.study.strategy;

/**
 * @author ldb
 * @date 2019-09-20 15:08
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
