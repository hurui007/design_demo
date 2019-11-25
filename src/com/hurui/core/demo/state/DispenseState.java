package com.hurui.core.demo.state;

/**
 * 抽中奖品之后，发放奖品的状态
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity){
        this.activity = activity;
    }


    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
        } else {
            //后面就不能进行抽奖啦，因为没有奖品了
            System.out.println("很遗憾，奖品发送完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
