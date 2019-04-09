package top.lrshuai.design.structure.filter.intrefaces.impl;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 并集 过滤器
 */
public class AddFilter implements Filter {

    private Filter one;
    private Filter two;

    public AddFilter(Filter one, Filter two) {
        this.one=one;
        this.two=two;
    }

    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> filterPerson1 = one.filterPerson(persons);
        return two.filterPerson(filterPerson1);
    }
}
