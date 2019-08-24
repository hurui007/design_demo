package com.hurui.core.design.inversion.improve;
/**
 * 依赖倒转的传递方式
 * @author ruihu
 *
 */
public class DependType3 {

	public static void main(String[] args) {
		

	}
	
	

	

}


interface IOpenAndClose3{
	public void open();//抽象方法
	
	public void setTv(ITV3 tv);
}

interface ITV3{
	public void play();
}

/**
 * 把要依赖的东西，通过setter方法
 * @author ruihu
 *
 */
class OpenAndClose3 implements IOpenAndClose3{

	private ITV3 tv;
	
	@Override
	public void open() {
		tv.play();
		
	}

	@Override
	public void setTv(ITV3 tv) {
		this.tv = tv;
		
	}
	

	
}

