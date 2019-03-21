package top.lrshuai.design.create.factory01.factory;

import top.lrshuai.design.create.factory01.interfaces.Fruits;
import top.lrshuai.design.create.factory01.interfaces.impl.Banana;
import top.lrshuai.design.create.factory01.interfaces.impl.Lemon;
import top.lrshuai.design.create.factory01.interfaces.impl.Orange;
import top.lrshuai.design.create.factory01.interfaces.impl.Pear;

public class FruitsFactory {
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
}
