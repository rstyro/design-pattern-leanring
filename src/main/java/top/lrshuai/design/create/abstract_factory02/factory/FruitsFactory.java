package top.lrshuai.design.create.abstract_factory02.factory;

import top.lrshuai.design.create.abstract_factory02.interfaces.Vegetables;
import top.lrshuai.design.create.factory01.interfaces.Fruits;
import top.lrshuai.design.create.factory01.interfaces.impl.Banana;
import top.lrshuai.design.create.factory01.interfaces.impl.Lemon;
import top.lrshuai.design.create.factory01.interfaces.impl.Orange;
import top.lrshuai.design.create.factory01.interfaces.impl.Pear;

public class FruitsFactory extends AbstractFactory{

    public Fruits getFruits(String name){
        if("banana".equalsIgnoreCase(name)){
            return new Banana();
        }else if("lemon".equalsIgnoreCase(name)){
            return new Lemon();
        }else if("orange".equalsIgnoreCase(name)){
            return new Orange();
        }else if("pear".equalsIgnoreCase(name)){
            return new Pear();
        }
        return null;
    }

    @Override
    public Vegetables getVegetables(String name) {
        return null;
    }
}
