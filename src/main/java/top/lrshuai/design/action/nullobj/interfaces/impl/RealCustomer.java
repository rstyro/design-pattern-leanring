package top.lrshuai.design.action.nullobj.interfaces.impl;

import top.lrshuai.design.action.nullobj.interfaces.AbstractCustomer;

/**
 * 具体的实现类
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name=name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
