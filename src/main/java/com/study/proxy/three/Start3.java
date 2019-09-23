package com.study.proxy.three;


/**
 * @author ldb
 * @date 2019-09-23 16:12
 */
public class Start3 {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.name = "李娇娇";

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
