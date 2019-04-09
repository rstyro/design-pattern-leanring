package top.lrshuai.design.structure.decorator.interfaces.impl;

import top.lrshuai.design.structure.decorator.interfaces.Fruits;

/**
 * 黄瓜
 */
public class Cucumber implements Fruits {
    @Override
    public void eatRawFood() {
        System.out.println("生吃黄瓜");
    }
}
