package com.study.memento.two;

/**
 * @author ldb
 * @date 2020/04/14
 * @description ??
 */
public class Client {

    public static void main(String[] args) {
        // 大战boss前
        System.out.println("大战boss前:");
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();
        System.out.println();

        // 保存进度
        System.out.println("保存进度");
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(lixiaoyao.saveState());

        // 大战boss，损耗严重
        System.out.println();
        System.out.println("大战boss，损耗严重");
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //  恢复之前状态
        System.out.println();
        System.out.println("恢复之前状态:");
        lixiaoyao.recoveryState(caretaker.getRoleStateMemento());

        lixiaoyao.stateDisplay();
    }
}
