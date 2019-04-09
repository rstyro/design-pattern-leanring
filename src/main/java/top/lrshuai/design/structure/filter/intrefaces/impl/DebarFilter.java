package top.lrshuai.design.structure.filter.intrefaces.impl;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 交集过滤器
 */
public class DebarFilter implements Filter {

    private Filter one;
    private Filter two;

    public DebarFilter(Filter one, Filter two) {
        this.one=one;
        this.two=two;
    }

    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        List<Person> filterPerson1 = one.filterPerson(persons);
        List<Person> filterPerson2 = two.filterPerson(persons);
        for(Person person:filterPerson1){
            if(!filterPerson2.contains(person)){
                result.add(person);
            }
        }
        return result;
    }
}
