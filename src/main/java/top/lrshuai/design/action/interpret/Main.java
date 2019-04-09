package top.lrshuai.design.action.interpret;

import top.lrshuai.design.action.interpret.interfaces.Expression;
import top.lrshuai.design.action.interpret.interfaces.impl.AndExpression;
import top.lrshuai.design.action.interpret.interfaces.impl.OrExpression;
import top.lrshuai.design.action.interpret.interfaces.impl.TerminalExpression;

/**
 * 解释器模式
 * 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 * 2、一些重复出现的问题可以用一种简单的语言来进行表达。
 * 3、一个简单语法需要解释的场景
 */
public class Main {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
