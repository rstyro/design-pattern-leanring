package top.lrshuai.design.structure.facade.interfaces.impl;


import top.lrshuai.design.structure.facade.interfaces.Shape;

/**
 * 对外暴露的方法
 */
public class ShapeMarker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMarker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
    public void drawCircle(){
        this.circle.draw();
    }
    public void drawRectangele(){
        this.rectangle.draw();
    }
    public void drawSquare(){
        this.square.draw();
    }
}
