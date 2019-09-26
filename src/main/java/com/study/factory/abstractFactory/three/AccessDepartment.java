package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:28
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access  department表插入");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("access 根据id取得department");
        return null;
    }
}
