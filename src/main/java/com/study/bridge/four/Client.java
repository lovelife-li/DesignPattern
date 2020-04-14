package com.study.bridge.four;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        HandsetBrand hb;

        hb = new HandsetBrandN();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();

        hb.setHandsetSoft(new HandsetAddressList());
        hb.run();

        hb = new HandsetBrandM();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();

        hb.setHandsetSoft(new HandsetAddressList());
        hb.run();

    }
}
