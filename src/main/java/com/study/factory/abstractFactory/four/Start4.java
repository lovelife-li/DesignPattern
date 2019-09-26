package com.study.factory.abstractFactory.four;


/**
 * @author ldb
 * @date 2019-09-25 17:22
 */
public class Start4 {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();
//        SqlServerFactory factory = new SqlServerFactory();

        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);


    }
}
