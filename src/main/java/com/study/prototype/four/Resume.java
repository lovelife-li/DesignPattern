package com.study.prototype.four;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-24 14:31
 */
@Data
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    // 显示
    public void display() {
        System.out.printf("%s %s %s \r\n", name, sex, age);
        System.out.printf("工作经历：%s %s\r\n", work.getWorkDate(), work.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume newResume = (Resume) super.clone();
        newResume.work = (WorkExperience) work.clone();
        return newResume;
    }
}
