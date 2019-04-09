package top.lrshuai.design.action.interpret.interfaces.impl;

import top.lrshuai.design.action.interpret.interfaces.Expression;

/**
 * 终结符表达式(Terminal Expression)角色
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
