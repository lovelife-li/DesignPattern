package com.study.decoration.two;

import com.study.decoration.one.Person;

/**
 * @author ldb
 * @date 2019-09-20 16:23
 */
public class start2 {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮：");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();
        dtx.show();
        kk.show();
        pqx.show();
        xc.show();

        System.out.println();
        System.out.println();

        System.out.println("第二种装扮：");
        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
        xc.show();
    }
}
