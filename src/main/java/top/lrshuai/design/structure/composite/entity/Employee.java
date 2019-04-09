package top.lrshuai.design.structure.composite.entity;

import lombok.*;

import java.util.List;

/**
 * 成员
 */
@Data
@ToString
@AllArgsConstructor
public class Employee {
    /**
     * 职称
     */
    private String name;
    /**
     * 部门
     */
    private String dept;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 手下
     */
    private List<Employee> subordinates;

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public void showMeInfo(int index){
        String tt = "";
        for (int i = 0; i < index; i++) {
            tt=tt+"\t";
        }
        System.out.println(tt+"name="+name+",dept="+dept+",salary="+salary);
        index++;
        for (Employee employee:subordinates){
            employee.showMeInfo(index);
        }
    }
}
