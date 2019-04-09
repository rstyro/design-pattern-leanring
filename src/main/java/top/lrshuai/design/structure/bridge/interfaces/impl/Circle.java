package top.lrshuai.design.structure.bridge.interfaces.impl;

import top.lrshuai.design.structure.bridge.interfaces.DrawAPI;
import top.lrshuai.design.structure.bridge.interfaces.Shape;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
