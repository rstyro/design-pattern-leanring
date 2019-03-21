package top.lrshuai.design.create.single03;

/**
 * 饿汉式单例
 */
public class SingleonHunger {
    private static SingleonHunger singleonLazy = new SingleonHunger();

    private SingleonHunger(){}
    public static SingleonHunger getInstance(){
        return singleonLazy;
    }

    public void show(){
        System.out.println("这是一个展示方法");
    }
}
