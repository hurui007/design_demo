package com.hurui.core.demo.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		super.setName("伦敦奶酪披萨");
		System.out.println("伦敦的奶酪披萨，准备原材料");
		
	}

}
