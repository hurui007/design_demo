package com.hurui.core.demo.factory.absfactory.pizzastore.order;

import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工厂模式");
		Pizza pizza = null;
		if("cheese".equals(orderType)) {
			pizza = new BJCheesePizza();
		} 
		else if("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		
		return pizza;
	}

}
