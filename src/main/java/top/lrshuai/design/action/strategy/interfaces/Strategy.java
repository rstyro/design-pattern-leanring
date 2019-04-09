package top.lrshuai.design.action.strategy.interfaces;

import lombok.Data;

/**
 * 策略接口
 */
public interface Strategy {
    public int doOperation(int num1, int num2);
}
