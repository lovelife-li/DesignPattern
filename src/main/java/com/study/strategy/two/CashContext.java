package com.study.strategy.two;

import com.study.strategy.CashSuper;

/**
 * @author ldb
 * @date 2019-09-20 15:31
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
