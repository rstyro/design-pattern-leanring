package top.lrshuai.design.create.single03;

/**
 * 单例 模式
 */
public class Main {
    public static void main(String[] args) {
        SingleonLazy singleonLazy = SingleonLazy.getInstance();
        singleonLazy.show();

        SingleonHunger singleonHunger = SingleonHunger.getInstance();
        singleonHunger.show();
    }
}
