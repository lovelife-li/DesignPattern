package com.study.observer.three;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-25 14:59
 * 主题就是通知者
 */
@Data
public abstract class Subject {
    abstract void  attach(Observer observer);
    abstract void detach(Observer observer);
    abstract void mynotify();

    String state;

}
