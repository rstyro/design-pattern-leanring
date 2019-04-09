package top.lrshuai.design.action.visitor.interfaces.impl;

import top.lrshuai.design.action.visitor.interfaces.ComputerPart;
import top.lrshuai.design.action.visitor.interfaces.ComputerPartVisitor;

public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
