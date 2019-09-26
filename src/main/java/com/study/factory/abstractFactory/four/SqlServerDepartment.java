package com.study.factory.abstractFactory.four;

/**
 * @author ldb
 * @date 2019-09-25 17:28
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("sqlserver  department表插入");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("sqlserver 根据id取得department");
        return null;
    }
}
