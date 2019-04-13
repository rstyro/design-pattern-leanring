package top.lrshuai.design.action.state.interfaces;

import top.lrshuai.design.action.state.entity.Context;

/**
 * 状态接口，它定义了每一个状态的行为集合，这些行为会在Context中得以使用。
 */
public interface State {
    public void doAction();
}
