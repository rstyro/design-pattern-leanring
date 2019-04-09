package top.lrshuai.design.action.state;

import top.lrshuai.design.action.state.entity.Context;
import top.lrshuai.design.action.state.interfaces.State;
import top.lrshuai.design.action.state.interfaces.impl.AngryState;
import top.lrshuai.design.action.state.interfaces.impl.HappyState;
import top.lrshuai.design.action.state.interfaces.impl.JoyState;
import top.lrshuai.design.action.state.interfaces.impl.SorrowState;

/**
 * 状态模式
 *
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        //切换状态
        context.angry();
        context.happy();
        context.joy();
        context.sorrow();


    }
}
