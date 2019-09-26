package com.study.observer.four;


import com.study.observer.three.Observer;
import com.study.observer.three.Subject;

/**
 * @author ldb
 * @date 2019-09-25 14:53
 */
public class NBAObserver {

    public void closeNBA(String name) {
        System.out.printf("%s关闭NBA直播，继续工作！", name);
        System.out.println();
    }
}
