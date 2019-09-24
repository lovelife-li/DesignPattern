package com.study.prototype.two;


/**
 * @author ldb
 * @date 2019-09-23 17:52
 */
public class Start2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");

        a.setPersonalInfo("男", "29 ");
        a.setWorkExperience(" 1998 - 2000 ", " Xx公司 ");

        Resume b = (Resume) a.clone();
        b.setPersonalInfo("男", " 29 ");
        b.setWorkExperience(" 1998 - 2006 ", " YY公司");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", "24");
        c.setWorkExperience("1998-2000", "XX公司");
        a.display();
        System.out.println();
        b.display();
        System.out.println();
        c.display();
    }
}
