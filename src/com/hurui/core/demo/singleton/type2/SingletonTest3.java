package com.hurui.core.demo.singleton.type2;
/**
 * 懒汉式-线程不安全
 * 需要使用时，才去创建对象
 * 但是线程不安全，多线程环境下使用，会出现创建多个实例的问题
 * @author ruihu
 *
 */
public class SingletonTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Singleton{
	//声明一个变量
	private static Singleton instance;
	//构造方法私有
	private Singleton() {}
	/**
	 * 获取对象实例，只有需要获取，并且对象实例为空时，才去创建
	 * 懒汉式
	 * @return
	 */
	public static Singleton getIntance() {
		 //这个if判断对多线程会存在并发问题，所以线程不安全
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
