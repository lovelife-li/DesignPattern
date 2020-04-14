package com.study.command.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
