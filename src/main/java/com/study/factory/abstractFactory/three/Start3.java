package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:22
 */
public class Start3 {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();
//        SqlServerFactory factory = new SqlServerFactory();

        AccessFactory factory = new AccessFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);


    }
}
