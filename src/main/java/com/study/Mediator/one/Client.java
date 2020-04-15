package com.study.Mediator.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setColleague1(usa);
        unsc.setColleague2(iraq);

        usa.declare("不准开发核武器，否则发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略");

    }
}
