package com.hurui.core.demo.builder;
/**
 * 抽象的建造者
 * @author ruihu
 *
 */
public abstract class HouseBuilder {
	
	protected House house = new House();
	
	//建造的流程，抽象的方法，让具体的子类实现。
	
	public abstract void buildBasic();
	
	public abstract void buildWalls();
	
	public abstract void roofed();
	
	/**
	 * 建造好房子后，将产品（房子）返回
	 * @return
	 */
	public House buildHouse() {
		return house;
	}

}
