package com.study.strategy.three;


/**
 * @author ldb
 * @date 2019-09-20 15:20
 * 简单工厂模式我需要让客户端认识两个类，CashSuper和CashFactory，而策略模式与简单工厂结合的用法，客户端就只需要认识一个类CashContext就可以了。耦合更加降低。
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
