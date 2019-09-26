package com.study.factory.abstractFactory.one;

/**
 * @author ldb
 * @date 2019-09-25 17:08
 */
public class Start1 {
    public static void main(String[] args) {
        User user = new User();
        SqlServerUser sqlServerUser = new SqlServerUser();
        sqlServerUser.insert(user);
        sqlServerUser.getUser(1);

    }
}
