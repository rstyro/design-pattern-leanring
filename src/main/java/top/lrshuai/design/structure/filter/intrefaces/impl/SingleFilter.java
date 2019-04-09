package top.lrshuai.design.structure.filter.intrefaces.impl;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 筛选 所有单身的
 */
public class SingleFilter implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person person:persons){
            if(!person.isMarry()){
                result.add(person);
            }
        }
        return result;
    }
}
