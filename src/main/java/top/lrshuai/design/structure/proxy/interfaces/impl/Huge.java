package top.lrshuai.design.structure.proxy.interfaces.impl;

import top.lrshuai.design.structure.proxy.interfaces.Star;

/**
 * 胡歌
 */
public class Huge implements Star {
    @Override
    public void sing(String name) {
        System.out.println("胡歌 唱歌："+name);
    }

    @Override
    public void dance() {
        System.out.println("胡歌 跳舞");
    }
}
