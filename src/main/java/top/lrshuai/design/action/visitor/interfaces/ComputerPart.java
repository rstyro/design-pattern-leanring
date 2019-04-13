package top.lrshuai.design.action.visitor.interfaces;

/**
 * 表示元素的接口。
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
