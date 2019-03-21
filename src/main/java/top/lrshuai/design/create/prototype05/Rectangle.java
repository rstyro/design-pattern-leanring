package top.lrshuai.design.create.prototype05;

public class Rectangle extends  Shape{
    public Rectangle(){
        this.name="矩形";
    }
    @Override
    void draw() {
        System.out.println("draw menthod");
    }
}
