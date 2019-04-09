package top.lrshuai.design.action.template;

import top.lrshuai.design.action.template.interfaces.Game;
import top.lrshuai.design.action.template.interfaces.impl.ChessGame;
import top.lrshuai.design.action.template.interfaces.impl.WeiQiGame;

/**
 * 模板模式
 *
 * 一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Main {

    public static void main(String[] args) {
        Game game = new ChessGame();
        game.play();

        System.out.println("===============");
        game = new WeiQiGame();
        game.play();
    }
}
