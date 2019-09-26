package com.study.observer.pattern;

/**
 * @author ldb
 * @date 2019-09-25 16:07
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject,"X"));
        subject.attach(new ConcreteObserver(subject,"Y"));

        subject.setSubjectState("ABC");
        subject.mynotify();

    }
}
