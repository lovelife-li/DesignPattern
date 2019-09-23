package com.study.strategy.one;

import com.study.strategy.CashNormal;
import com.study.strategy.CashRebate;
import com.study.strategy.CashReturn;
import com.study.strategy.CashSuper;

/**
 * @author ldb
 * @date 2019-09-20 15:16
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
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
        return cs;
    }
}
