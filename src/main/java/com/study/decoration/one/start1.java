package com.study.decoration.one;

/**
 * @author ldb
 * @date 2019-09-20 16:23
 */
public class start1 {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮：");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println();
        System.out.println();

        System.out.println("第二种装扮：");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();
    }
}
