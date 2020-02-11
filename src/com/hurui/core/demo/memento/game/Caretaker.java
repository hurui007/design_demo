package com.hurui.core.demo.memento.game;

import java.lang.management.MemoryManagerMXBean;
import java.util.List;
import java.util.Map;

/**
 * 守护者对象，保存游戏角色状态
 */
public class Caretaker {

    //如果只需要保存一次状态
    private Memento memento;

    //对多个游戏角色状态的保存
    private Map<String, List<Memento>> rolesMemontos;


    public void setMemento(Memento memento){
        this.memento = memento;
    }
    public Memento getMemento(){
        return this.memento;
    }

}
