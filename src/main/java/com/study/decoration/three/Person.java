package com.study.decoration.three;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ldb
 * @date 2019-09-23 14:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    public  void show(){
        System.out.printf("装扮的%s", name);
    }
}
