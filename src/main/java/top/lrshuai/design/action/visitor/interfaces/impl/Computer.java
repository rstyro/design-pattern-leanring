package top.lrshuai.design.action.visitor.interfaces.impl;

import top.lrshuai.design.action.visitor.interfaces.ComputerPart;
import top.lrshuai.design.action.visitor.interfaces.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
