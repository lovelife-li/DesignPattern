package com.study.command.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execCommand() {
        command.execute();
    }
}
