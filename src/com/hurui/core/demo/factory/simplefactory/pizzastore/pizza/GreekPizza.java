package com.hurui.core.demo.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

	public GreekPizza() {}
	
	@Override
	public void prepare() {
		System.out.println("给希腊披萨 准备预原材料");

	}

}
