package com.study.factory.abstractFactory.four;

/**
 * @author ldb
 * @date 2019-09-25 18:04
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException,
            ClassNotFoundException {
        User user = new User();
        Department dept = new Department();
//        SqlServerFactory factory = new SqlServerFactory();

        IUser iu = DataAccess2
                .createUser("com.study.factory.abstractFactory.four.SqlServerUser");
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = (IDepartment) DataAccess2
                .createDepartment("com.study.factory.abstractFactory.four.SqlServerDepartment");
        id.insert(dept);
        id.getDepartment(1);
    }
}
