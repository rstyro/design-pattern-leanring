package top.lrshuai.design.action.template.interfaces.impl;

import top.lrshuai.design.action.template.interfaces.Game;

/**
 * 象棋游戏
 */
public class ChessGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("创建一盘象棋");
    }

    @Override
    protected void startPlay() {
        System.out.println("开始下棋");
    }

    @Override
    protected void endPlay() {
        System.out.println("获得胜利，游戏结束");
    }


}
