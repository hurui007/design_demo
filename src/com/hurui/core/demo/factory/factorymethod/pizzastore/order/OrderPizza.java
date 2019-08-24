package com.hurui.core.demo.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hurui.core.demo.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {

	//定义一个抽象方法，让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);
	
	public OrderPizza() {
		Pizza pizza = null;
		//具体怎么创建，让子类自己去完成
		pizza = createPizza(getType());
		//披萨的制作过程
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
				
	}
	
	//写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" input pizza type:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		
	}
		
		
		
	
}
