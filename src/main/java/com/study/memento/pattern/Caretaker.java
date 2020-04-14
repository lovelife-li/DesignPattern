package com.study.memento.pattern;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-11-08 15:49
 * Caretaker（管理者）：负责保存好备忘录Memento，不能对备忘录的内容进行操作或检查。
 */
@Data
public class Caretaker {

    private Memento memento;

}
