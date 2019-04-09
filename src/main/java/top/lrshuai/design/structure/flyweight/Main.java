package top.lrshuai.design.structure.flyweight;

import top.lrshuai.design.structure.flyweight.entity.ShapeFactory;
import top.lrshuai.design.structure.flyweight.interfaces.impl.Circle;

/**
 * 享元模式
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能
 */
public class Main {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
