package com.study.strategy;

/**
 * @author ldb
 * @date 2019-09-20 15:08
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

    public CashRebate(String  moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
}
