package com.hurui.core.design.liskov;

public class Liskov {
	
	public static void main(String[] args) {
		
	}

}


class A {
	//返回两个数的差
	public int func1(int num1, int num2) {
		return num1-num2;
	}
}

//继承了A
class B extends A {
	/**
	 * 重写了父类的func1方法
	 */
	@Override
	public int func1(int a, int b) {
		return a + b;
	}
	
	public int func2(int a, int b) {
		return func1(a,b) + 9;
	}
}