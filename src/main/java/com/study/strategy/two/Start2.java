package com.study.strategy.two;

import com.study.strategy.CashNormal;
import com.study.strategy.CashRebate;
import com.study.strategy.CashReturn;

/**
 * @author ldb
 * @date 2019-09-20 15:20
 */
public class Start2 {
    static double total = 0.0d;

    public static void main(String[] args) {
        String costType = "打8折";
        double totalPrices = 0d;
        double price = 100d;
        int num = 2;
        CashContext cc = null;
        switch (costType){
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300返100":
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate("0.8"));
                break;
            default:
        }
        totalPrices = cc.getResult(price*num);
        total = total + totalPrices;
        System.out.println("单价：" + price + " |数量：" + num +" |"+costType +" |合计：" + total);
    }
}
