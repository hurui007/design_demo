package com.hurui.core.demo.builder;
/**
 * 建房的指挥者,动态指定制作流程,返回流程
 * @author ruihu
 *
 */
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;
	
	//传入HouseBuilder 可以通过构造器和set方法传入
	
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//如何处理建房的流程，交给指挥者完成
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}
