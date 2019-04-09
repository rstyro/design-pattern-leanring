package top.lrshuai.design.structure.jdkProxy.intrefaces.impl;


import top.lrshuai.design.structure.jdkProxy.intrefaces.Star;

/**
 * 胡歌
 */
public class HuGe implements Star {
    @Override
    public void sing(String name) {
        System.out.println("胡歌 唱歌："+name);
    }

    @Override
    public void dance() {
        System.out.println("胡歌 跳舞");
    }
}
