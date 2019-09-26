package com.study.observer.three;



/**
 * @author ldb
 * @date 2019-09-25 14:53
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.printf("%s,%s关闭股票行情，继续工作！", sub.getState(), name);
        System.out.println();
    }
}
