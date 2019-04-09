package top.lrshuai.design.structure.facade;

import top.lrshuai.design.structure.facade.interfaces.impl.ShapeMarker;

/**
 * 外观模式
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 */
public class Main {
    public static void main(String[] args) {
        ShapeMarker shapeMarker = new ShapeMarker();

        shapeMarker.drawCircle();
        shapeMarker.drawRectangele();
        shapeMarker.drawSquare();
    }
}
