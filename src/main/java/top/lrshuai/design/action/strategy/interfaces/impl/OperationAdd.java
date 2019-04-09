package top.lrshuai.design.action.strategy.interfaces.impl;

import lombok.Data;
import top.lrshuai.design.action.strategy.interfaces.Strategy;

/**
 * 加 的操作
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
