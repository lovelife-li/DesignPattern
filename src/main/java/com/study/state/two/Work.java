package com.study.state.two;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-26 8:46
 */
@Data
public class Work {

    private int hour;
    private boolean workFinished = false;

    // 写程序
    public  void writeProgram() {
        if (hour < 12) {
            System.out.printf("当前时间：%s点 上午工作，精神百倍", hour);
            System.out.println();
        } else if (hour < 13) {
            System.out.printf("当前时间：%s点，饿了，午饭;犯困，午休", hour);
            System.out.println();
        } else if (hour < 17) {
            System.out.printf("当前时间：%s点，下午状态还不错，继续努力", hour);
            System.out.println();
        } else {
            if (workFinished) {
                System.out.printf("当前时间：%s点 下班回家了", hour);
                System.out.println();
            } else {
                if (hour < 21) {
                    System.out.printf("当前时间：%s点 加班哦，疲累之极", hour);
                    System.out.println();
                } else {
                    System.out.printf("当前时间：%s点 不行了，睡着了。", hour);
                    System.out.println();
                }
            }
        }


    }
}
