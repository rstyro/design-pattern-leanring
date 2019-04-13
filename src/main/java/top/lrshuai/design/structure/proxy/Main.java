package top.lrshuai.design.structure.proxy;

import top.lrshuai.design.structure.proxy.interfaces.Star;
import top.lrshuai.design.structure.proxy.interfaces.impl.HugeProxy;

/**
 * 静态代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问
 * 我们创建具有现有对象的对象，以便向外界提供功能接口
 */
public class Main {
    public static void main(String[] args) {
        Star huge = new HugeProxy();
        huge.sing("六月的雨");
        huge.dance();
    }
}
