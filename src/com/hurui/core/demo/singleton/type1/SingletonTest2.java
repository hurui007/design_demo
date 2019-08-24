package com.hurui.core.demo.singleton.type1;
/**
 * 饿汉式单例，静态代码块
 * @author ruihu
 *
 */
public class SingletonTest2 {

	public static void main(String[] args) {
		Singleton02 a = Singleton02.getInstance();
		Singleton02 b = Singleton02.getInstance();
		System.out.println(a);
		System.out.println(b);
	}

}

/**
 * 饿汉式单例，静态代码块
 * @author ruihu
 *
 */
class Singleton02 {
	//1、私有构造方法
	private Singleton02() {}
	//声明变量
	private static Singleton02 instance;
	//将new操作放到静态代码块中
	static {
		instance = new Singleton02();
	}
	//范湖对象实例
	public static Singleton02 getInstance() {
		return instance;
	}
	
	
	
}