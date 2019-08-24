package com.hurui.core.demo.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("北京奶酪披萨");
		System.out.println("北京的奶酪披萨，准备原材料");
		
	}

}
