package top.lrshuai.design.action.observer;

import top.lrshuai.design.action.observer.interfaces.Observer;
import top.lrshuai.design.action.observer.interfaces.impl.User;
import top.lrshuai.design.action.observer.interfaces.impl.WechatServer;

/**
 * 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("张三");
        Observer userLi = new User("李四");
        Observer userWang = new User("王五");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
    }
}
