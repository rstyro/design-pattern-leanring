package top.lrshuai.design.action.nullobj;

import top.lrshuai.design.action.nullobj.entity.CustomerFactory;
import top.lrshuai.design.action.nullobj.interfaces.AbstractCustomer;

/**
 * 空对象设计模式
 * 一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
 */
public class Main {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("张三");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("李四");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("王五");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("赵六");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());
    }
}
