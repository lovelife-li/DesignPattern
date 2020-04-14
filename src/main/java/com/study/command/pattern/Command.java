package com.study.command.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
