package com.study.memento.two;

import lombok.Data;

/**
 * @author ldb;
 * @date 2020/4/14
 * @description 游戏角色
 */
@Data
public class GameRole {
    // 生命力
    private int vit;

    // 攻击力
    private int atk;

    // 防御力
    private int def;

    // 状态显示
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.printf("体力：%s \n", vit);
        System.out.printf("攻击力：%s \n", atk);
        System.out.printf("防御力：%s \n", this.def);
    }

    // 获得初始状态
    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复
    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    // 战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }


}
