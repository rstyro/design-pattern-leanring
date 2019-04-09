package top.lrshuai.design.action.command.entity;

import top.lrshuai.design.action.command.interfaces.Command;

/**
 * 传递命令对象 Invoker
 */
public class Xiaoming {


    private Command command;

    /**
     * 设置命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void doCommand(){
        command.execute();
    }
}
