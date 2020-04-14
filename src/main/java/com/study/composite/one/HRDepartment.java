package com.study.composite.one;

import java.util.Collections;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 人力资源部
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.printf("%s 员工招聘培训管理", name);
        System.out.println();
    }
}
