package com.hurui.core.demo.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity){
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣过了积分");
    }

    /**
     * 可以抽奖，并且可以更改为新的状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍后");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num == 0){
            //改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，您没有抽中奖品");
            activity.setState(activity.getNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
