package com.study.strategy.three;


/**
 * @author ldb
 * @date 2019-09-20 15:20
 */
public class Start3 {
    static double total = 0.0d;

    public static void main(String[] args) {
        String costType = "打8折";
        double totalPrices = 0d;
        double price = 100d;
        int num = 2;
        CashContext cc = new CashContext(costType);

        totalPrices = cc.getResult(price*num);
        total = total + totalPrices;
        System.out.println("单价：" + price + " |数量：" + num +" |"+costType +" |合计：" + total);
    }
}
