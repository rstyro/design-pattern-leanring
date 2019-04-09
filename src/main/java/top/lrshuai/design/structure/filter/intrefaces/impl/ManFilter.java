package top.lrshuai.design.structure.filter.intrefaces.impl;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取所有 男性
 */
public class ManFilter implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person person:persons){
            if(person.getGender() == 1){
                result.add(person);
            }
        }
        return result;
    }
}
