package com.study.command.two;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription 服务员
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command.toString().equals("命令模式.BakeChickenWingCommand")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤！");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "时间：" + LocalDate.now());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "时间：" + LocalDate.now());

    }

    public void mynotify() {
        for (Command order : orders) {
            order.executeCommand();
        }
    }
}
