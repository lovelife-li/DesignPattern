package com.study.observer.two;


/**
 * @author ldb
 * @date 2019-09-25 14:44
 */
public class Start2 {
    public static void main(String[] args) {
        // 前台小姐童子喆 （通知者）
        Secretary tongzizhe = new Secretary();

        // 看股票的同事
        StockObserver tongshi1 = new StockObserver("未观察", tongzizhe);
        NBAObserver tongshi2 = new NBAObserver("易管查", tongzizhe);

        // 前台记下了两位同事
        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        // 发现老板回来了
        tongzizhe.setAction("老板回来了");

        // 通知两个同事
        tongzizhe.myNotify();


    }
}
