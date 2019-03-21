package top.lrshuai.design.create.builder04.impl;

public class Coke extends ColdDrink{
    @Override
    public String itemName() {
        return "可乐";
    }

    @Override
    public float price() {
        return 5f;
    }
}
