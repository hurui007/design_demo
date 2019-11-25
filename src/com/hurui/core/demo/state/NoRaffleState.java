package com.hurui.core.demo.state;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState extends State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity){
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后将状态设置成可以抽奖的状态
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦");
        return false;
    }

    /**
     * 当前状态不能抽奖，肯定也不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
