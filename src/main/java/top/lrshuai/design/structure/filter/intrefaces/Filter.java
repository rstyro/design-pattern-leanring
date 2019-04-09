package top.lrshuai.design.structure.filter.intrefaces;

import top.lrshuai.design.structure.filter.entity.Person;

import java.util.List;

/**
 * 过滤器
 */
public interface Filter {
    public List<Person> filterPerson(List<Person> persons);
}
