package com.hurui.core.demo.factory.absfactory.pizzastore.order;

public class PizzaStore {
	
	public static void main(String[] args) {
		//System.out.println("使用的是抽象工厂模式");
		OrderPizza order = new OrderPizza(new BJFactory());
	}

}
