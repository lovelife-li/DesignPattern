package com.study.proxy.two;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-23 15:16
 */
@Data
@AllArgsConstructor
public class Proxy {

    SchoolGirl mm;

    public void giveDolls() {
        System.out.println(mm.name + "送你洋娃娃");
    }

    public void giveFlowers() {
        System.out.println(mm.name + "送你花");
    }

    public void giveChocolate() {
        System.out.println(mm.name + "送你巧克力");
    }
}
