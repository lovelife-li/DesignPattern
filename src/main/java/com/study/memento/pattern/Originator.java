package com.study.memento.pattern;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-11-08 15:45
 * Originator（发起人）：负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，
 */
@Data
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("state=" + state);
    }
}
