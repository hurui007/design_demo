package com.hurui.core.demo.singleton.type7;
/**
 * 静态内部类-线程安全，懒加载，推荐使用
 * @author ruihu
 *
 */
public class SingletonType7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton {
	
	private Singleton() {}
	
	//加载Singleton这个类时，静态内部类不会被加载
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	//调用静态内部类时，加载这个内部类，是线程安全的
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
