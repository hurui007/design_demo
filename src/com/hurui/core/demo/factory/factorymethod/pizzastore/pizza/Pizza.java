package com.hurui.core.demo.factory.factorymethod.pizzastore.pizza;

public abstract class Pizza {
	
	/**
	 * 名字
	 */
	protected String name;
	 
	/**
	 * 不同的披萨，准备的原料不同，准备工作不同，
	 * 所以这个方法需要子类实现
	 */
	public abstract void prepare();
	/**
	 * 烘烤
	 */
	public void bake() {
		System.out.println(name + " baking");
	}
	
	public void cut() {
		System.out.println(name + " cutting");
	}
	/**
	 * 打包
	 */
	public void box() {
		System.out.println(name + " boxing");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
