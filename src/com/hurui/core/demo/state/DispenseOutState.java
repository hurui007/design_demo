package com.hurui.core.demo.state;

/**
 * 奖品发放完毕状态,活动结束
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity){
        this.activity = activity;
    }


    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次参加");
    }
}
