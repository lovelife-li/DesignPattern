package com.study.command.two;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription 抽象命令
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
