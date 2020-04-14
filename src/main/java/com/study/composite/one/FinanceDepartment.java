package com.study.composite.one;

import java.util.Collections;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 财务部
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-"))+ name);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%s 公司财务收支管理", name);
        System.out.println();
    }
}
