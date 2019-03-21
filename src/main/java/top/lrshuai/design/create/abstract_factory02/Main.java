package top.lrshuai.design.create.abstract_factory02;

import top.lrshuai.design.create.abstract_factory02.factory.AbstractFactory;
import top.lrshuai.design.create.abstract_factory02.factory.FactoryProducer;
import top.lrshuai.design.create.abstract_factory02.interfaces.Vegetables;
import top.lrshuai.design.create.factory01.interfaces.Fruits;

/**
 * 抽象工厂实现
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory fruitsFactory = FactoryProducer.getFactory(FactoryProducer.FruitsFactory);

        Fruits fruits = fruitsFactory.getFruits("orange");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("banana");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("pear");
        System.out.println(fruits.getFruits());

        fruits = fruitsFactory.getFruits("lemon");
        System.out.println(fruits.getFruits());

        System.out.println("=================");
        AbstractFactory vegetablesFactory = FactoryProducer.getFactory(FactoryProducer.VegetablesFactory);

        Vegetables vegetables = vegetablesFactory.getVegetables("aubergine");
        System.out.println(vegetables.getVegetables());

        vegetables = vegetablesFactory.getVegetables("onion");
        System.out.println(vegetables.getVegetables());

        vegetables = vegetablesFactory.getVegetables("potato");
        System.out.println(vegetables.getVegetables());

        vegetables = vegetablesFactory.getVegetables("tomato");
        System.out.println(vegetables.getVegetables());
    }
}
