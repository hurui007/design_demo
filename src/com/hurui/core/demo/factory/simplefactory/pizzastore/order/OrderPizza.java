package com.hurui.core.demo.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hurui.core.demo.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @title 给披萨下单的类
 * @author ruihu
 *
 */
public class OrderPizza {
	
	public OrderPizza() {
/*		Pizza pizza = null;
		String orderType;//订购披萨的类型
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊披萨");
			}
			else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while(true);*/
		
		setFactory();
		
		
	}
	
	Pizza pizza = null;
	
	
	public void setFactory() {
		String orderType = "";
		
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza(orderType);
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("pizza 订购失败");
				break;
			}
		} while(true);
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
