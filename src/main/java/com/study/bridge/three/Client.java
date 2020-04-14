package com.study.bridge.three;

import com.study.bridge.one.HandsetNgame;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        HandsetBrand hb;

        hb = new HandsetBrandMAddressList();
        hb.run();

        hb = new HandsetBrandMGame();
        hb.run();

        hb = new HandsetBrandNAddressList();
        hb.run();

        hb = new HandsetBrandNGame();
        hb.run();
    }
}
