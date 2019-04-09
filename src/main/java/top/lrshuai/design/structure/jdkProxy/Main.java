package top.lrshuai.design.structure.jdkProxy;

import top.lrshuai.design.structure.jdkProxy.intrefaces.Star;
import top.lrshuai.design.structure.jdkProxy.intrefaces.impl.HuGeProxy;

/**
 * JDK 代理
 */
public class Main {
    public static void main(String[] args) {
        HuGeProxy huGeProxy = new HuGeProxy();
        Star huge = huGeProxy.getProxy();

        huge.sing("六月的雨");
        System.out.println();
        huge.dance();
    }
}
