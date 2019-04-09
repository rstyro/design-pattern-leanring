package top.lrshuai.design.action.nullobj.entity;

import top.lrshuai.design.action.nullobj.interfaces.AbstractCustomer;
import top.lrshuai.design.action.nullobj.interfaces.impl.NullCustomer;
import top.lrshuai.design.action.nullobj.interfaces.impl.RealCustomer;

/**
 * 自定义工厂类
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie","张三","王五"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
