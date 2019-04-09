package top.lrshuai.design.action.state.interfaces.impl;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;

@Data
@ToString
public class HappyState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Happy state");
        System.out.println("今天天气很好，我很开心");
    }
}
