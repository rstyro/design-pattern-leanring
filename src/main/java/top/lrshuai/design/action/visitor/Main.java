package top.lrshuai.design.action.visitor;

import top.lrshuai.design.action.visitor.interfaces.ComputerPart;
import top.lrshuai.design.action.visitor.interfaces.impl.Computer;
import top.lrshuai.design.action.visitor.interfaces.impl.ComputerPartDisplayVisitor;

/**
 * 访问者模式
 * 我们使用了一个访问者类，它改变了元素类的执行算法
 */
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
