package com.hurui.core.design.segregation;
/**
 * 没有遵守接口隔离的写法
 * @author ruihu
 *
 */
public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface Interface1 {
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

/**
 * @title B实现了接口的全部方法
 * @author ruihu
 *
 */
class B implements Interface1{

	@Override
	public void operation1() {
		System.out.println("B 实现operation1");
	}

	@Override
	public void operation2() {
		System.out.println("B 实现operation2");
	}

	@Override
	public void operation3() {
		System.out.println("B 实现operation3");
	}

	@Override
	public void operation4() {
		System.out.println("B 实现operation4");
	}

	@Override
	public void operation5() {
		System.out.println("B 实现operation5");
	}
	
}

/**
 * @title D实现了全部方法
 * @author ruihu
 *
 */
class D implements Interface1{

	@Override
	public void operation1() {
		System.out.println("D 实现operation1");
	}

	@Override
	public void operation2() {
		System.out.println("D 实现operation2");
	}

	@Override
	public void operation3() {
		System.out.println("D 实现operation3");
	}

	@Override
	public void operation4() {
		System.out.println("D 实现operation4");
	}

	@Override
	public void operation5() {
		System.out.println("D 实现operation5");
	}
	
}


/**
 * @title A只依赖的1，2，3，三个方法
 * 通过接口Integer1 依赖（使用）B类，但是只会用到1，2，3三个方法
 * 方法入参为B类
 * @author ruihu
 *
 */
class A {
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface1 i) {
		i.operation2();
	}
	public void depend3(Interface1 i) {
		i.operation3();
	}
}

/**
 * @title C只依赖的1，4，5，三个方法
 * 通过接口Integer1 依赖（使用）D类，但是只会用到1，4，5三个方法
 * 方法入参为D类
 * @author ruihu
 *
 */
class C {
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface1 i) {
		i.operation4();
	}
	public void depend5(Interface1 i) {
		i.operation5();
	}
}

