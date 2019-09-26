package com.study.observer.three;


/**
 * @author ldb
 * @date 2019-09-25 14:53
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.printf("%s,%s关闭NBA直播，继续工作！", sub.getState(), name);
        System.out.println();
    }
}
