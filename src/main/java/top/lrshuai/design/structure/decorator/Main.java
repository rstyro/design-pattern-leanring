package top.lrshuai.design.structure.decorator;

import top.lrshuai.design.structure.decorator.interfaces.Fruits;
import top.lrshuai.design.structure.decorator.interfaces.FruitsDecorator;
import top.lrshuai.design.structure.decorator.interfaces.impl.Cucumber;
import top.lrshuai.design.structure.decorator.interfaces.impl.Lemon;
import top.lrshuai.design.structure.decorator.interfaces.impl.Orange;
import top.lrshuai.design.structure.decorator.interfaces.impl.Tomato;
import top.lrshuai.design.structure.decorator.interfaces.process.CucumberDecorator;
import top.lrshuai.design.structure.decorator.interfaces.process.TomatoDecorator;

/**
 * 设计模式
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活
 */
public class Main {
    public static void main(String[] args) {
        Fruits fruits1 = new Orange();
        Fruits fruits2 = new Lemon();
        Fruits fruits3 = new TomatoDecorator(new Tomato());
        Fruits fruits4 = new CucumberDecorator(new Cucumber());

        fruits1.eatRawFood();
        System.out.println();
        fruits2.eatRawFood();
        System.out.println();
        fruits3.eatRawFood();
        System.out.println();
        fruits4.eatRawFood();
    }
}
