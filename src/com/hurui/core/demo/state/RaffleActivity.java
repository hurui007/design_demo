package com.hurui.core.demo.state;


public class RaffleActivity {

    //当前活动的状态
    State state = null;

    private int count;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * 1、初始化当前状态为不能抽奖的状态
     * @param count
     */
    public RaffleActivity(int count){
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣积分，当前状态的扣积分
     */
    public void debuctMoney(){
        state.deduceMoney();
    }

    public void raffle(){
        //如果当前的状态是抽取成功，就领取奖品
        if(state.raffle()){
            //领取奖品
            state.dispensePrize();
        }
    }







    public int getCount(){
        int curCount = this.count;
        count--;
        return curCount;
    }

    public void setCount(int count){
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canFaffleState) {
        this.canRaffleState = canFaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
