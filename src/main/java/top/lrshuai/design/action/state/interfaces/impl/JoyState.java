package top.lrshuai.design.action.state.interfaces.impl;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;

@Data
@ToString
public class JoyState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Joy State");
        System.out.println("今天有人请吃海底捞，贼开心");
    }
}
