package com.hurui.core.demo.memento.game;

public class Memento {

    //攻击力
    private int vit;
    //防守力
    private int def;

    public Memento(int vit, int def){
        this.vit = vit;
        this.def = def;
    }

    public int getVit(){
        return this.vit;
    }
    public void setVit(int vit){
        this.vit = vit;
    }

    public int getDef(){
        return this.def;
    }
    public void setDef(int def){
        this.def = def;
    }
}
