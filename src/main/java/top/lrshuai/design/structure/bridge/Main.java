package top.lrshuai.design.structure.bridge;

import top.lrshuai.design.structure.bridge.interfaces.Shape;
import top.lrshuai.design.structure.bridge.interfaces.impl.Circle;
import top.lrshuai.design.structure.bridge.interfaces.impl.GreenCircle;
import top.lrshuai.design.structure.bridge.interfaces.impl.RedCircle;

/**
 * 桥接模式
 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(-100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
