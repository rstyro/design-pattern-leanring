package top.lrshuai.design.action.visitor.interfaces;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
