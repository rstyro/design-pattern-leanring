package top.lrshuai.design.create.prototype05;

public class Square extends  Shape{
    public Square(){
        this.name="方格";
    }
    @Override
    void draw() {
        System.out.println("draw menthod");
    }
}
