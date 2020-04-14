package com.study.command.two;


/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class Client {
    public static void main(String[] args) {

        // 开店前的准备
        Barbecuer barbecuer = new Barbecuer();
        Command command1 = new BakeMuttonCommand(barbecuer);
        Command command2 = new BakeMuttonCommand(barbecuer);
        Command command3 = new BakeChickenWingCommand(barbecuer);

        // 开门营业，顾客点菜
        Waiter girl = new Waiter();
        girl.setOrder(command1);
        girl.setOrder(command2);
        girl.setOrder(command3);

        // 点完菜，通知厨房
        girl.mynotify();
    }
}
