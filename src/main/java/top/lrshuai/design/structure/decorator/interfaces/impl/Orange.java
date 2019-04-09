package top.lrshuai.design.structure.decorator.interfaces.impl;

import top.lrshuai.design.structure.decorator.interfaces.Fruits;

public class Orange implements Fruits {
    @Override
    public void eatRawFood() {
        System.out.println("生吃橙子");
    }
}
