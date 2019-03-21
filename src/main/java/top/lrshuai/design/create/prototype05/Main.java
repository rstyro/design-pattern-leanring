package top.lrshuai.design.create.prototype05;

/**
 * 原型模式
 *用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape(1);
        System.out.println("Shape : " + shape.getName());

        shape = ShapeCache.getShape(2);
        System.out.println("Shape : " + shape.getName());

        shape = ShapeCache.getShape(3);
        System.out.println("Shape : " + shape.getName());
    }
}
