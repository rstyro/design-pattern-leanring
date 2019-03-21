package top.lrshuai.design.create.builder04.meal;

import top.lrshuai.design.create.builder04.interfaces.Item;

import java.util.List;

/**
 * 套餐
 */
public class Meal {
    private String mealName;
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public float getPrice(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public void showItemList(){
        for (Item item : items) {
            System.out.print("Item-Name : "+item.itemName());
            System.out.print(", Packing : "+item.packing().packing());
            System.out.println(", Price : "+item.price());
        }
        System.out.println("套餐名称："+mealName+"\t"+"总价格："+getPrice());
        System.out.println();
    }
}
