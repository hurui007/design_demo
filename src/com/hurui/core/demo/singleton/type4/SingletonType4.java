package com.hurui.core.demo.singleton.type4;
/**
 * 懒汉式单例模式-线程安全，同步方法
 * @author ruihu
 *
 */
public class SingletonType4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton {
	
	
	private static Singleton instance;
	
	private Singleton() {};
	//加上synchronized 这样多个线程环境下，不存在线程安全问题
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
