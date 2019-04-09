package top.lrshuai.design.structure.filter.intrefaces.impl;

import top.lrshuai.design.structure.filter.entity.Person;
import top.lrshuai.design.structure.filter.intrefaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取所有女性
 */
public class FemaleFilter implements Filter {
    @Override
    public List<Person> filterPerson(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person person:persons){
            if(person.getGender() == 0){
                result.add(person);
            }
        }
        return result;
    }
}
