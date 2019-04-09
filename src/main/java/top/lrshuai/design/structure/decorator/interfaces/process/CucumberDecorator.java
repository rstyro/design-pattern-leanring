package top.lrshuai.design.structure.decorator.interfaces.process;

import top.lrshuai.design.structure.decorator.interfaces.Fruits;
import top.lrshuai.design.structure.decorator.interfaces.FruitsDecorator;

public class CucumberDecorator extends FruitsDecorator {

    public CucumberDecorator(Fruits fruits) {
        super(fruits);
    }

    @Override
    public void eatRawFood() {
        super.eatRawFood();
        cookedFood();
        System.out.println();
    }

    public void cookedFood(){
        System.out.println("但是也可以去炒着吃");
    }
}
