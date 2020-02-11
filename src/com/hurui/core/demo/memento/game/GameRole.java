package com.hurui.core.demo.memento.game;

/**
 * 游戏角色
 */
public class GameRole {

    private int vit;

    private int def;

    public GameRole(int vit, int def){
        this.vit = vit;
        this.def = def;
    }

    /**
     * 根据当前状态得到Memento对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(this.vit, this.def);
    }

    /**
     * 从备忘录对象，恢复gameRole的状态
     * @param memento
     */
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display(){
        System.out.println("当前角色的攻击力：" + this.vit + ", 当前角色的防御力:" + this.def);
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
