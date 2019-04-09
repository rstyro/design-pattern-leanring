package top.lrshuai.design.action.strategy;

import top.lrshuai.design.action.strategy.entity.Context;
import top.lrshuai.design.action.strategy.interfaces.impl.OperationAdd;
import top.lrshuai.design.action.strategy.interfaces.impl.OperationDivide;
import top.lrshuai.design.action.strategy.interfaces.impl.OperationMultiply;
import top.lrshuai.design.action.strategy.interfaces.impl.OperationSub;

/**
 * 策略模式
 * 一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法
 *
 * 和状态模式有点像呢
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 8;
        Context context = new Context(new OperationAdd());
        System.out.println(num1 +" + "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationSub());
        System.out.println(num1 +" - "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationMultiply());
        System.out.println(num1 +" * "+num2+" = "+context.execute(num1,num2));

        context = new Context(new OperationDivide());
        System.out.println(num1 +" / "+num2+" = "+context.execute(num1,num2));
    }
}
