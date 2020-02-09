package com.hurui.core.demo.mediator.smarthouse;

import javax.swing.text.TabableView;
import java.util.HashMap;

/**
 * 具体的中介者对象类
 */
public class ConcreteMediator extends Mediator {

    //放入了所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;


    public ConcreteMediator(){
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    //具体中介者的核心方法,根据得到的消息，完成对应任务
    //中介者在这个方法中，协调具体的同事对象，完成任务
    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if(colleague instanceof Alarm){
            interMap.put("Alarm", colleagueName);
        }
        else if(colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine", colleagueName);
        }
        else if(colleague instanceof TV){
            interMap.put("TV", colleagueName);
        }
        else if(colleague instanceof Curtains){
            interMap.put("Curtains", colleagueName);
        }

    }

    /**
     * 具体中介者的核心方法
     * 根据得到的消息，完成对应任务
     * 中介者在这个方法，协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param colleaagueName
     */
    @Override
    public void getMessage(int stateChange, String colleaagueName) {
        if(colleagueMap.get(colleaagueName) instanceof Alarm){
            //如果是闹钟发出的消息，就进行如下操作
            if(stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTv();
            }
            else if(stateChange == 1){
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTv();
            }
        }
        else if(colleagueMap.get(colleaagueName) instanceof CoffeeMachine){
            //如果咖啡机发出消息，就升起窗帘
            ((Curtains)(colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        }
        else if(colleagueMap.get(colleaagueName) instanceof TV){
            //如果是电视发出的消息，就不做任何操作

        }
        else if(colleagueMap.get(colleaagueName) instanceof Curtains){
            //如果是窗帘发出的消息，就不做任何操作
        }
    }

    @Override
    public void sendMessage() {

    }
}
