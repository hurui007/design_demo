package com.hurui.core.design.inversion.improve;
/**
 * 依赖倒转的传递方式
 * @author ruihu
 *
 */
public class DependType2 {

	public static void main(String[] args) {
		

	}
	
	

	

}


interface IOpenAndClose2{
	public void open();//抽象方法
}

interface ITV2{
	public void play();
}

/**
 * 把要依赖的东西，通过构造方法进行传递
 * @author ruihu
 *
 */
class OpenAndClose2 implements IOpenAndClose2{
	
	public ITV2 tv;//成员
	
	//构造方法
	public OpenAndClose2(ITV2 tv) {
		this.tv = tv;
	}

	@Override
	public void open() {
		tv.play();
		
	}

	
}

