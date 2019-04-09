package top.lrshuai.design.structure.decorator.interfaces;

public abstract class FruitsDecorator implements Fruits{

    Fruits fruits;

    public FruitsDecorator(Fruits fruits) {
        this.fruits = fruits;
    }

    @Override
    public void eatRawFood() {
        fruits.eatRawFood();
    }
}
