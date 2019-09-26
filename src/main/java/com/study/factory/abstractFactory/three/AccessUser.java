package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:17
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在access中给user表添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在access中根据id得到user");
        return null;
    }
}
