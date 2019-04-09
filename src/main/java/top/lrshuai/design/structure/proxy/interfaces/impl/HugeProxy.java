package top.lrshuai.design.structure.proxy.interfaces.impl;

import top.lrshuai.design.structure.proxy.interfaces.Star;

public class HugeProxy implements Star {

    private Star huge = new Huge();

    @Override
    public void sing(String name) {
        huge.sing(name);
    }

    @Override
    public void dance() {
        huge.dance();
    }
}
