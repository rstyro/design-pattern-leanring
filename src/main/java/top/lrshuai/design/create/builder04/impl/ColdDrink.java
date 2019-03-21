package top.lrshuai.design.create.builder04.impl;

import top.lrshuai.design.create.builder04.interfaces.Item;
import top.lrshuai.design.create.builder04.interfaces.Packing;

/**
 * 冷饮 抽象类
 */
public abstract  class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
