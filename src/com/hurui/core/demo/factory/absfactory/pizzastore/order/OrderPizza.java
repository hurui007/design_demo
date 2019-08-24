package com.hurui.core.demo.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	
	public AbsFactory factory;

	
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}


	/**
	 * factory 可能是北京也可能是伦敦的工厂子类
	 * @param factory
	 */
	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";
		
		this.factory = factory;
		
		do {
			orderType = getType();
			pizza = factory.createPizza(orderType);
			if(pizza != null) {
				//披萨的制作过程
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		}
		while(true);
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
