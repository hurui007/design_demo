package com.hurui.core.design.inversion;

public class DependecyInversion {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}

}

class Email {
	public String getInfo() {
		return "电子邮件信息：hello，world";
	}
	
}

/**
 * 完成Person接收消息的功能
 * 方式1完成
 * 分析：好处：简单，容易实现，但是如果获取的对象是微信，短信，这个怎么修改呢，
 * 那就需要新增类
 * 解决思路：
 * 	引入一个抽象接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
 * @author ruihu
 *
 */
class Person{
	public void receive(Email mail) {
		System.out.println(mail.getInfo());
	}
	
}
