package com.study.prototype.one;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-23 17:48
 */
@Data
public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    // 显示
    public void display() {
        System.out.printf("%s %s %s \r\n", name, sex, age);
        System.out.printf("工作经历：%s %s\r\n", timeArea, company);
    }
}
