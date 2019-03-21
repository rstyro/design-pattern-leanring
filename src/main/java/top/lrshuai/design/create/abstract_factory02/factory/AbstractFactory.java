package top.lrshuai.design.create.abstract_factory02.factory;

import top.lrshuai.design.create.abstract_factory02.interfaces.Vegetables;
import top.lrshuai.design.create.factory01.interfaces.Fruits;

public abstract class AbstractFactory {
    public abstract Fruits getFruits(String name);
    public abstract Vegetables getVegetables(String name);
}
