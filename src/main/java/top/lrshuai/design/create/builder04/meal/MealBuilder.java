package top.lrshuai.design.create.builder04.meal;

import top.lrshuai.design.create.builder04.impl.ChickenBurger;
import top.lrshuai.design.create.builder04.impl.Coke;
import top.lrshuai.design.create.builder04.impl.Milk;
import top.lrshuai.design.create.builder04.impl.VegetableBurger;
import top.lrshuai.design.create.builder04.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {

    public Meal chickenMeal(){
        List<Item> items = new ArrayList<>();
        Item burger = new ChickenBurger();
        Item drink = new Coke();
        items.add(burger);
        items.add(drink);
        Meal meal = new Meal();
        meal.setItems(items);
        meal.setMealName("鸡肉套餐");
        return meal;
    }

    public Meal vegetableMeal(){
        List<Item> items = new ArrayList<>();
        Item burger = new VegetableBurger();
        Item drink = new Milk();
        items.add(burger);
        items.add(drink);
        Meal meal = new Meal();
        meal.setItems(items);
        meal.setMealName("蔬菜套餐");
        return meal;
    }
}
