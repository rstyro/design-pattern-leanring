package top.lrshuai.design.create.single03;

/**
 * 懒汉式单例
 */
public class SingleonLazy {
    private static SingleonLazy singleonLazy;

    private SingleonLazy(){}
    public static SingleonLazy getInstance(){
        if(singleonLazy == null){
            synchronized (SingleonLazy.class){
                if(singleonLazy == null) {
                    singleonLazy = new SingleonLazy();
                }
            }
        }
        return singleonLazy;
    }

    public void show(){
        System.out.println("这是一个展示方法");
    }
}
