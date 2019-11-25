package com.hurui.core.demo.state;

public class ClientTest {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);
        for(int i = 0;i< 300;i++){
            System.out.println("---第" + (i + 1) + "次抽奖----");
            activity.debuctMoney();
            activity.raffle();
        }
    }
}
