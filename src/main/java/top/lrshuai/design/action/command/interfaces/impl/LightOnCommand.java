package top.lrshuai.design.action.command.interfaces.impl;

import top.lrshuai.design.action.command.entity.Light;
import top.lrshuai.design.action.command.interfaces.Command;

/**
 * 具体的命令对象ConcreteCommand：：开灯命令
 */
public class LightOnCommand implements Command {

    private Light light;

    /**
     * 创建开灯命令的时候，传入具体的灯对象，由灯对象操作自己
     * @param light
     */
    public LightOnCommand(Light light){
        this.light=light;
    }

    /**
     * 具体的灯对象调用自己的开灯方法
     */
    @Override
    public void execute() {
        light.lightOn();
    }
}
