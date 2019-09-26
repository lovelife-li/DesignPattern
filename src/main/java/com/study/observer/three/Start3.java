package com.study.observer.three;



/**
 * @author ldb
 * @date 2019-09-25 14:44
 */
public class Start3 {
    public static void main(String[] args) {
        Boss boss = new Boss();

        // 看股票的同事
        StockObserver tongshi1 = new StockObserver("未观察", boss);
        NBAObserver tongshi2 = new NBAObserver("易管查", boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.detach(tongshi1);

        // 发现老板回来了
        boss.setState("我胡汉三回来了");

        // 通知两个同事
        boss.mynotify();


    }
}
