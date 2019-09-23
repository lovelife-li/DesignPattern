package com.study.decoration.three;

/**
 * @author ldb
 * @date 2019-09-20 16:23
 */
public class start3 {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮：");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();

        pqx.decorate(xc);
        kk.decorate(pqx);
        dtx.decorate(kk);

        dtx.show();

        System.out.println();
        System.out.println();

        System.out.println("第二种装扮：");
        Finery px = new LeatherShoes();
        Finery ld = new Tie();
        Finery xz = new Suit();

        px.decorate(xc);
        ld.decorate(px);
        xz.decorate(ld);

        xz.show();


    }
}
