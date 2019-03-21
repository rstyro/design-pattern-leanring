package top.lrshuai.design.create.builder04.impl;

import top.lrshuai.design.create.builder04.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String packing() {
        return "拿瓶子包装的";
    }
}
