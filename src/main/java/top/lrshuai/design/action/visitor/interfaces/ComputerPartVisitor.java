package top.lrshuai.design.action.visitor.interfaces;

import top.lrshuai.design.action.visitor.interfaces.impl.Computer;
import top.lrshuai.design.action.visitor.interfaces.impl.Keyboard;
import top.lrshuai.design.action.visitor.interfaces.impl.Monitor;
import top.lrshuai.design.action.visitor.interfaces.impl.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
