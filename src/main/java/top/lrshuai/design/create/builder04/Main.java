package top.lrshuai.design.create.builder04;

import top.lrshuai.design.create.builder04.meal.Meal;
import top.lrshuai.design.create.builder04.meal.MealBuilder;

/**
 * 建造者模式
 * 使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal chickenMeal = mealBuilder.chickenMeal();
        chickenMeal.showItemList();

        Meal vegetableMeal = mealBuilder.vegetableMeal();
        vegetableMeal.showItemList();
    }
}
