package com.study.command.two;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
