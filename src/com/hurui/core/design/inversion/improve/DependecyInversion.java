package com.hurui.core.design.inversion.improve;
/**
 * 根据接口依赖倒转改进
 * @author ruihu
 *
 */
public class DependecyInversion {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}

}

class Email implements IReceiver {

	@Override
	public String getInfo() {
		return "电子邮件信息：hello world";
	}
	
}


class WeiXin implements IReceiver {

	@Override
	public String getInfo() {
		return "微信信息：hello world";
	}
	
}

/**
 * 完成Person接收消息的功能
 * 对接口的依赖
 * @author ruihu
 *
 */
class Person{
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
	
}
