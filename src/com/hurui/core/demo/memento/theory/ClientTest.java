package com.hurui.core.demo.memento.theory;

public class ClientTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1 攻击力100");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2 攻击力80");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3 攻击力50");

        caretaker.add(originator.saveStateMemento());


        System.out.println("当前状态是：" + originator.getState());

        //恢复到状态1
        originator.getStateMemento(caretaker.get(0));
        System.out.println("恢复到状态1之后：" + originator.getState());

    }
}
