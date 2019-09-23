package com.study.proxy.one;

/**
 * @author ldb
 * @date 2019-09-23 15:13
 */
public class Start1 {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.name = "李娇娇";

        Pursuit zhuojiayii = new Pursuit(jiaojiao);

        zhuojiayii.giveDolls();
        zhuojiayii.giveFlowers();
        zhuojiayii.giveChocolate();

    }
}
