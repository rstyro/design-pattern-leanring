package top.lrshuai.design.create.builder04.impl;

public class ChickenBurger extends  Burger{
    @Override
    public String itemName() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 12.6f;
    }
}
