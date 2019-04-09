package top.lrshuai.design.action.strategy.entity;

import lombok.Data;
import top.lrshuai.design.action.strategy.interfaces.Strategy;

@Data
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2){
        return  strategy.doOperation(num1,num2);
    }
}
