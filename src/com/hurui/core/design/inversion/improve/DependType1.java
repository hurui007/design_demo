package com.hurui.core.design.inversion.improve;
/**
 * 依赖倒转的传递方式
 * @author ruihu
 *
 */
public class DependType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

	

}


//方式1，通过接口依赖,每一个依赖都是接口
interface IOpenAndClose {
	public void open(ITV tv);
}

interface ITV {
	public void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose{

	@Override
	public void open(ITV tv) {
		tv.play();
	}
	
}


