package com.hurui.core.demo.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("北京胡椒披萨");
		System.out.println("北京的胡椒披萨，准备原材料");
		
	}

}
