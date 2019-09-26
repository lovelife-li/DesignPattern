package com.study.observer.one;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-25 14:37
 */
@Data
@AllArgsConstructor
public class StockObserver {
    private String name;
    private Secretary sub;


    public void update() {
        System.out.printf("%s,%s关闭股票行情，继续工作！", sub.getAction(), name);
        System.out.println();
    }
}
