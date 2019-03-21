package top.lrshuai.design.create.builder04.impl;

import top.lrshuai.design.create.builder04.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String packing() {
        return "拿纸包装的";
    }
}
