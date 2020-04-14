package com.study.command.one;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class Client {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();

        barbecuer.bakeChickenWing();
        barbecuer.bakeChickenWing();
        barbecuer.bakeChickenWing();
        barbecuer.bakeChickenWing();
    }
}
