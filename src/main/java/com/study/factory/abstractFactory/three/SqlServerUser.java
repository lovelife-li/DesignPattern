package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:17
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SqL server中给user表添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SqL server中根据id得到user");
        return null;
    }
}
