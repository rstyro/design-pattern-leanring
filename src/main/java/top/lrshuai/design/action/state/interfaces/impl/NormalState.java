package top.lrshuai.design.action.state.interfaces.impl;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;

@Data
@ToString
public class NormalState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Normal State");
        System.out.println("今天和往常一样，过了一个平凡的一天");
    }
}
