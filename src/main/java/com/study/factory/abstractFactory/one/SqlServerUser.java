package com.study.factory.abstractFactory.one;

/**
 * @author ldb
 * @date 2019-09-25 17:06
 */
public class SqlServerUser {

    public void insert(User user){
        System.out.println("在SqL server中给user表添加一条记录");
    }

    public User getUser(int id){
        System.out.println("在SqL server中根据id得到user");
        return null;
    }
}
