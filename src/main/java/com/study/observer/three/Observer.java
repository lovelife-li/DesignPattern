package com.study.observer.three;

import com.study.observer.two.Secretary;
import lombok.AllArgsConstructor;

/**
 * @author ldb
 * @date 2019-09-25 14:52
 */
@AllArgsConstructor
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public abstract void update();
}
