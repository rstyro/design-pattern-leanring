package top.lrshuai.design.action.iterator;

import top.lrshuai.design.action.iterator.interfaces.Iterator;
import top.lrshuai.design.action.iterator.interfaces.impl.NameRepository;

/**
 * 迭代器 模式
 * 提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 */
public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
