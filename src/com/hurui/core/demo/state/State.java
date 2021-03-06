package com.hurui.core.demo.state;

/**
 * 状态接口
 */
public abstract class State {

    //扣除积分
    public abstract void deduceMoney();
    //是否抽中奖品
    public abstract boolean raffle();
    //发放奖品
    public abstract void dispensePrize();
}
