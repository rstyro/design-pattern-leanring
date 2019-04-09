package top.lrshuai.design.action.observer.interfaces.impl;

import lombok.Data;
import top.lrshuai.design.action.observer.interfaces.Observer;

@Data
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        read();
    }
    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
