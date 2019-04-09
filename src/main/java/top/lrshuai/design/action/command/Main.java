package top.lrshuai.design.action.command;

import top.lrshuai.design.action.command.entity.Light;
import top.lrshuai.design.action.command.entity.Xiaoming;
import top.lrshuai.design.action.command.interfaces.impl.LightOffCommand;
import top.lrshuai.design.action.command.interfaces.impl.LightOnCommand;


/**
 * 命令模式
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 */
public class Main {
    public static void main(String[] args) {
        Xiaoming xiaoming = new Xiaoming();
        // 创建具体的等对象，相当于具体的命令接受者
        Light light = new Light();
        // 创建了开灯的命令，你就是命令的发起者
        System.out.println("小明，帮我把灯开一下！");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        // 小爱同学接受到了你发出的命令,并执行命令
        xiaoming.setCommand(lightOnCommand);
        xiaoming.doCommand();

        System.out.println("-------------------------------------------------");
        System.out.println("小明，帮我关一下灯！");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        xiaoming.setCommand(lightOffCommand);
        xiaoming.doCommand();
    }
}
