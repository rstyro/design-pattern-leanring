package top.lrshuai.design.create.builder04.impl;

public class VegetableBurger extends  Burger{
    @Override
    public String itemName() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 6.6f;
    }
}
