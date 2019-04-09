package top.lrshuai.design.structure.decorator.interfaces.impl;

import top.lrshuai.design.structure.decorator.interfaces.Fruits;

public class Tomato implements Fruits {
    @Override
    public void eatRawFood() {
        System.out.println("生吃西红柿");
    }
}
