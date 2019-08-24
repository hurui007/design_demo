package com.hurui.core.demo.singleton.type6;
/**
 * 双重检查锁-线程安全，推荐使用
 * @author ruihu
 *
 */
public class SingletonType6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton{
	//volatile 这个关键字是为了在线程间同步使用
	private static volatile Singleton instance;
	
	private Singleton() {}
	
	/**
	 * 双重检查，线程安全，不会浪费内存，推荐使用
	 * @return
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
}