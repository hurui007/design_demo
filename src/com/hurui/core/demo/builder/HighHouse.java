package com.hurui.core.demo.builder;

public class HighHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高楼的地基100米");

	}

	@Override
	public void buildWalls() {
		System.out.println("高楼的砌墙20cm");

	}

	@Override
	public void roofed() {
		System.out.println("高楼的透明屋顶");

	}

}
