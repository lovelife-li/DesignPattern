package com.study.factory.abstractFactory.two;

/**
 * @author ldb
 * @date 2019-09-25 17:22
 */
public class Start2 {
    public static void main(String[] args) {
        User user = new User();
        SqlServerFactory factory = new SqlServerFactory();

        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

    }
}
