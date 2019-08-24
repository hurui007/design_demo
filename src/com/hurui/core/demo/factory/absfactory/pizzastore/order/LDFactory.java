package com.hurui.core.demo.factory.absfactory.pizzastore.order;

import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工厂模式");
		Pizza pizza = null;
		if("cheese".equals(orderType)) {
			pizza = new LDCheesePizza();
		} 
		else if("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
