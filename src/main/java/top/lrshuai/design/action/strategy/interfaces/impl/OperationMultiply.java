package top.lrshuai.design.action.strategy.interfaces.impl;

import lombok.Data;
import top.lrshuai.design.action.strategy.interfaces.Strategy;

/**
 * 乘 的操作
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
