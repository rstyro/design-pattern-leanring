package top.lrshuai.design.action.nullobj.interfaces.impl;

import top.lrshuai.design.action.nullobj.interfaces.AbstractCustomer;

/**
 * 具体的实现类
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "this is null Object not Available name";
    }
}
