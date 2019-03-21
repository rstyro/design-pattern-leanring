package top.lrshuai.design.create.prototype05;

public class Circle extends  Shape{
    public Circle(){
        this.name="圆形";
    }
    @Override
    void draw() {
        System.out.println("draw menthod");
    }
}
