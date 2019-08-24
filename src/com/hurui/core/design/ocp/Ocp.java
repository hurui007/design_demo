package com.hurui.core.design.ocp;
/**
 * 开闭原则
 * @author ruihu
 *
 */
public class Ocp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//这是一个用户绘图的类
class GraphicEditor {
	
	//根据不同类型调用不同的方法，来绘制不同的图形
	public void drawShape(Shape s) {
		if(s.m_type == 1) {
			drawRectangle(s);
		}
		else if(s.m_type == 2) {
			drawCircle(s);
		}
	}
	
	public void drawRectangle(Shape r) {
		System.out.println("矩形");
	}
	public void drawCircle(Shape r) {
		System.out.println("圆形");
	}
	
}

//基类
class Shape {
	int m_type;
}

class Rectangle extends Shape {
	Rectangle(){
		super.m_type = 1;
	}
}

class Circle extends Shape {
	Circle(){
		super.m_type = 2;
	}
}