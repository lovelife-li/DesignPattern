package com.study.adapter.one;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-11-08 15:14
 */
@Data
public class ForeignCenter {
    private String name;

    public void 进攻() {
        System.out.printf("外籍中锋%s进攻\n", name);
    }

    public void 防守() {
        System.out.printf("外籍中锋%s防守\n", name);
    }
}
