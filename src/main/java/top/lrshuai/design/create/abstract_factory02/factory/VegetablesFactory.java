package top.lrshuai.design.create.abstract_factory02.factory;

import top.lrshuai.design.create.abstract_factory02.interfaces.Vegetables;
import top.lrshuai.design.create.abstract_factory02.interfaces.impl.Aubergine;
import top.lrshuai.design.create.abstract_factory02.interfaces.impl.Onion;
import top.lrshuai.design.create.abstract_factory02.interfaces.impl.Potato;
import top.lrshuai.design.create.abstract_factory02.interfaces.impl.Tomato;
import top.lrshuai.design.create.factory01.interfaces.Fruits;

public class VegetablesFactory extends AbstractFactory{
    @Override
    public Fruits getFruits(String name) {
        return null;
    }

    public Vegetables getVegetables(String name){
        if("aubergine".equalsIgnoreCase(name)){
            return new Aubergine();
        }else if("onion".equalsIgnoreCase(name)){
            return new Onion();
        }else if("potato".equalsIgnoreCase(name)){
            return new Potato();
        }else if("tomato".equalsIgnoreCase(name)){
            return new Tomato();
        }
        return null;
    }
}
