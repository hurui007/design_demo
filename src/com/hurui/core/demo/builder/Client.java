package com.hurui.core.demo.builder;

public class Client {

	public static void main(String[] args) {
		
		//该普通房子
		CommonHouse commonHouse = new CommonHouse();
		//创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//完成盖房子，返回产品
		House house = houseDirector.constructHouse();
		System.out.println(house.getBasic());

	}

}
