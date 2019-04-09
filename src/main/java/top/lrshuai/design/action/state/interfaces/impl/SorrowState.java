package top.lrshuai.design.action.state.interfaces.impl;

import lombok.Data;
import lombok.ToString;
import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;

@Data
@ToString
public class SorrowState implements State {
    private String stateName;

    public void doAction() {
        this.setStateName("Sorrow State");
        System.out.println("哎，我家的二狗生病了，好伤心");
    }
}
