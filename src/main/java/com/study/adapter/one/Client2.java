package com.study.adapter.one;

/**
 * @author ldb
 * @date 2019-11-08 15:20
 */
public class Client2 {
    public static void main(String[] args) {
        Player b = new Forwards("小巴");
        b.attack();
        Player m = new Guards("小麦");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
