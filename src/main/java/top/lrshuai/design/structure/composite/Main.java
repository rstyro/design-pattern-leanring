package top.lrshuai.design.structure.composite;

import top.lrshuai.design.structure.composite.entity.Employee;

import java.util.ArrayList;

/**
 * 组合模式
 *
 */
public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000,new ArrayList<Employee>());

        Employee headSales = new Employee("Robert","Head Sales", 20000,new ArrayList<Employee>());

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000,new ArrayList<Employee>());

        Employee clerk1 = new Employee("Laura","Marketing", 10000,new ArrayList<Employee>());
        Employee clerk2 = new Employee("Bob","Marketing", 10000,new ArrayList<Employee>());

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000,new ArrayList<Employee>());
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000,new ArrayList<Employee>());

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        CEO.showMeInfo(0);
    }
}
