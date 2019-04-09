package top.lrshuai.design.structure.bridge.interfaces.impl;

import top.lrshuai.design.structure.bridge.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("draw Cricle color:green,radius=%s,x=%s,y=%s", radius,x,y));
    }
}
