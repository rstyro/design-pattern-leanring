package top.lrshuai.design.structure.filter;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;
import top.lrshuai.design.structure.filter.intrefaces.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * 使用不同的标准来过滤一组对象
 *
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("刘一",0, false));
        persons.add(new Person("陈二",0, true));
        persons.add(new Person("张三",1, false));
        persons.add(new Person("李四",1, true));
        persons.add(new Person("王五",0, false));
        persons.add(new Person("赵六",0, false));
        persons.add(new Person("孙七",1, true));
        persons.add(new Person("周八",0, false));
        persons.add(new Person("吴九",1, false));
        persons.add(new Person("郑十",1, true));

        Filter marryFilter = new MarryFilter();
        Filter singleFilter = new SingleFilter();
        Filter femaleFilter = new FemaleFilter();
        Filter manFilter = new ManFilter();

        //已婚女士
        Filter marryFemaleFilter = new AddFilter(marryFilter,femaleFilter);
        //所有单身女士
        Filter singleFemaleFilter = new AddFilter(singleFilter,femaleFilter);

        //所有单身男士
        Filter singleManFilter = new DebarFilter(singleFilter,femaleFilter);

        System.out.println("\n已婚女士:");
        List<Person> marryFemale = marryFemaleFilter.filterPerson(persons);
        printPersons(marryFemale);

        System.out.println("\n还单身的男士:");
        List<Person> singleMan = singleManFilter.filterPerson(persons);
        printPersons(singleMan);

        System.out.println("\n还单身的女士:");
        List<Person> singleFemale = singleFemaleFilter.filterPerson(persons);
        printPersons(singleFemale);



    }


    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ 姓名 : " + person.getName()
                    +", 性别 : " + (person.getGender()==1?"男":"女")
                    +", 婚姻状况 : " +(person.isMarry()?"已婚":"未婚")
                    +" ]");
        }
    }
}
