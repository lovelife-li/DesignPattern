package com.study.decoration.three;

/**
 * @author ldb
 * @date 2019-09-23 14:41
 */
public class Suit extends Finery {

    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
