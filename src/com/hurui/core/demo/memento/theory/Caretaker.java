package com.hurui.core.demo.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    //备忘录对象集合
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        if(index >= mementoList.size()){
            return null;
        }
        return mementoList.get(index);
    }
}
