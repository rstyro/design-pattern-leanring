package top.lrshuai.design.action.mediator;

import top.lrshuai.design.action.mediator.entity.User;

/**
 * 中介者模式
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 *
 */
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        // 通过聊天室 把信息展示出来
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
