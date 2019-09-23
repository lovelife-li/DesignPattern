package com.study.strategy.three;

import com.study.strategy.CashNormal;
import com.study.strategy.CashRebate;
import com.study.strategy.CashReturn;
import com.study.strategy.CashSuper;

/**
 * @author ldb
 * @date 2019-09-20 15:31
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
            default:

        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
