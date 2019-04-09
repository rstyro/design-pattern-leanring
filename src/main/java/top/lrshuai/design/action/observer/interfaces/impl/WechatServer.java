package top.lrshuai.design.action.observer.interfaces.impl;

import top.lrshuai.design.action.observer.interfaces.Observer;
import top.lrshuai.design.action.observer.interfaces.Observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号
 * 被观察者
 */
public class WechatServer implements Observerable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public WechatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(list != null && list.size()>0){

            if(o instanceof User){
                User u = (User) o;
                System.out.println(u.getName() + "取消了订阅");
            }

            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o:list){
            o.update(this.message);
        }
    }

    // 更新消息
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
