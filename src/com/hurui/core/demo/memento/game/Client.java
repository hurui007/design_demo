package com.hurui.core.demo.memento.game;

public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 100);
        System.out.println("游戏角色和Boss大战前的状态:");
        gameRole.display();

        //把当前游戏状态报春到Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和Boss大战一场");
        gameRole.setVit(50);
        gameRole.setDef(60);
        gameRole.display();

        //恢复状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
