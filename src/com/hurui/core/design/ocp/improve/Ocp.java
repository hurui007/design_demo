package com.hurui.core.design.ocp.improve;

public class Ocp {

	public static void main(String[] args) {
		GraphicEditor gr = new GraphicEditor();
		gr.drawShape(new Rectangle());
		gr.drawShape(new Circle());
		gr.drawShape(new Triangle());

	}

}

//Shape 也可以用抽象类代替
class GraphicEditor {
	public void drawShape(Shape s) {
		s.draw();
	}
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("绘制矩形");
	}
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制原型");
	}
	
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制三角形");
	}
	
}
