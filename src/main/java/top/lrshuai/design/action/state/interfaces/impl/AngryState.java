package top.lrshuai.design.action.state.interfaces.impl;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;

@Data
@ToString
public class AngryState implements State {
    private String stateName;
    @Override
    public void doAction() {
        this.setStateName("Angry State");
        System.out.println("别烦我，我现在很愤怒");
    }
}
