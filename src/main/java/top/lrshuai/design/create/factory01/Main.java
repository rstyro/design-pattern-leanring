package top.lrshuai.design.create.factory01;

import top.lrshuai.design.create.factory01.factory.FruitsFactory;
import top.lrshuai.design.create.factory01.interfaces.Fruits;

/**
 * 工厂模式代码实现
 */
public class Main {
    public static void main(String[] args) {
        FruitsFactory fruitsFactory = new FruitsFactory();
        Fruits fruits = fruitsFactory.getFruits("orange");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("banana");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("pear");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("lemon");
        System.out.println(fruits.getFruits());
    }
}
