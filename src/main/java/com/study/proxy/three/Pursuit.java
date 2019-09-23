package com.study.proxy.three;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-23 16:08
 */
@Data
@AllArgsConstructor
public class Pursuit implements GiveGift {

    SchoolGirl mm;

    @Override
    public void giveDolls() {
        System.out.println(mm.name + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.name + "送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.name + "送你巧克力");
    }
}
