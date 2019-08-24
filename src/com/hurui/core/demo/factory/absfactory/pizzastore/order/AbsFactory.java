package com.hurui.core.demo.factory.absfactory.pizzastore.order;

import com.hurui.core.demo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽闲层（接口）
 * @author ruihu
 *
 */
public interface AbsFactory {
	/**
	 * 让下面的子类来具体的实现
	 * @param orderType
	 * @return
	 */
	public Pizza createPizza(String orderType);

}
