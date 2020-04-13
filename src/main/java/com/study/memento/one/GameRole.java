package com.study.memento.one;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-11-08 15:30
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
    public void stateDisplay(){
        System.out.println("角色当前状态：");
        System.out.printf("体力：%s \n",vit);
        System.out.printf("攻击力：%s \n",atk);
        System.out.printf("防御力：%s \n",this.def);
    }

    // 获得初始状态
    public void getInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 战斗
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public static void main(String[] args) {
        // 大战boss前
        System.out.println("大战boss前:");
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        System.out.println();

        // 保存进度
        System.out.println("保存进度");
        GameRole backup = new GameRole();
        backup.setAtk(lixiaoyao.getAtk());
        backup.setDef(lixiaoyao.getDef());
        backup.setVit(lixiaoyao.getVit());

        // 大战boss，损耗严重
        System.out.println();
        System.out.println("大战boss，损耗严重");
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //  恢复之前状态
        System.out.println();
        System.out.println("恢复之前状态:");
        lixiaoyao.setVit(backup.getVit());
        lixiaoyao.setDef(backup.getDef());
        lixiaoyao.setAtk(backup.getAtk());

        lixiaoyao.stateDisplay();

    }}
