package hideojr.practice.ch3;

import hideojr.practice.ch3.Practice_Father;

/**
 * 子類別。
 * @author William
 * @version 1.0
 */
public class Practice_ChildB extends Practice_Father {
	
	String name = "Ray";
	
	@Override
	public void showInfo() {	 //該方法與父類別的showInfo方法是沒有覆寫關係的，可用Annotation @Override幫你檢查
		System.out.println("I am Practice_ChildB!");
		return; //無回傳值得方法，也可以適時地在程式中加入以結束方法呼叫
	}
	
	public void saySomething() {
		System.out.println("Hello, World!");		
	}

}
