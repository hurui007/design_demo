package com.hurui.core.demo.builder;
/**
 * 具体的房子建造过程
 * @author ruihu
 *
 */
public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBasic("5米");
		System.out.println("普通房子打地基5米");

	}

	@Override
	public void buildWalls() {
		house.setWall("10cm");
		System.out.println("普通房子砌墙10cm");

	}

	@Override
	public void roofed() {
		house.setRoofed("普通屋顶");
		System.out.println("普通房子屋顶");

	}

}
