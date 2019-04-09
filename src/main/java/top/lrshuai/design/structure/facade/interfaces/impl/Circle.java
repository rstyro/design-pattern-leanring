package top.lrshuai.design.structure.facade.interfaces.impl;

import top.lrshuai.design.structure.facade.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
