package top.lrshuai.design.structure.facade.interfaces.impl;

import top.lrshuai.design.structure.facade.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
