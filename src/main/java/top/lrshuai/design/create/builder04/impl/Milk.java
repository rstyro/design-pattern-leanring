package top.lrshuai.design.create.builder04.impl;

public class Milk extends ColdDrink{
    @Override
    public String itemName() {
        return "奶茶";
    }

    @Override
    public float price() {
        return 5f;
    }
}
