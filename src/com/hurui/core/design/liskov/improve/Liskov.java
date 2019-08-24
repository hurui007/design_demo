package com.hurui.core.design.liskov.improve;
/**
 * 根据里氏替换原则改进 
 * @author ruihu
 *
 */
public class Liskov {
	
	public static void main(String[] args) {
		
	}

}


//创建一个更加基础的基类
class Base {
	//把更加基础的方法和成员写到base类
}

class A extends Base {
	//返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

//通过A 和B 的组合，解除了他们之间的依赖关系
class B extends Base {
	//如果B需要调用A类的方法，使用组合关系
	private A a = new A();
	//我们仍然想使用A的方法
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
	
	//这里重写了A类的方法，可能是无意识的
	public int func1(int a, int b) {
		return a + b;
	}
	
	public int func2(int a, int b) {
		return func1(a,b) + 9;
	}
}

