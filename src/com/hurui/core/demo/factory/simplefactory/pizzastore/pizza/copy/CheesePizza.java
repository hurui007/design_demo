package com.hurui.core.demo.factory.simplefactory.pizzastore.pizza.copy;

public class CheesePizza extends Pizza {

	
	public CheesePizza() {}
	
	@Override
	public void prepare() {
		System.out.println(" 给制作奶酪披萨， 准备原材料");
		
	}

}
