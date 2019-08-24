package com.hurui.core.demo.singleton.type1;
/**
 * 饿汉式单例，静态变量
 * @author ruihu
 *
 */
public class SingletonTest1 {

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		System.out.println(a);
		System.out.println(b);

	}

}

/**
 * 饿汉式单例，静态变量
 * @author ruihu
 *
 */
class Singleton {
	
	//1、构造器私有化，外部能new
	private Singleton(){
		
	}
	
	//2、本类内部创建对象实例
	private final static Singleton instance = new Singleton();
	//3、提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
	
}