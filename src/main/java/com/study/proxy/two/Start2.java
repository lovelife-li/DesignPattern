package com.study.proxy.two;


/**
 * @author ldb
 * @date 2019-09-23 15:18
 */
public class Start2 {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.name = "李娇娇";

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
