package hideojr.practice.ch3.sub;

import hideojr.practice.ch3.Practice_Father;

/**
 * 子類別。
 * @author William
 * @version 1.0
 */
public class Practice_ChildA extends Practice_Father {
	
	String name = "Ray";
	
	//Compile warning:The method Practice_ChildA.showInfo() does not override the inherited method from Practice_Father since it is private to a different package
	public void showInfo() {	 //該方法與父類別的showInfo方法是沒有覆寫關係的，可用Annotation @Override幫你檢查
		System.out.println("I am Practice_ChildA!");
		System.out.println("I am Practice_ChildA " + name1);
		return; //無回傳值得方法，也可以適時地在程式中加入以結束方法呼叫
	}
	
	public String getMsg(Practice_Father obj) {
		return null; //obj.name1; //compile error: The field Practice_Father.name1 is not visible
	}
	
	public String getMsg(Practice_ChildA obj) {
		return obj.name1;
	}

	protected interface ChildAInnerInterface {
		void childAMove();
	}
	
	protected static interface ChildAInnerInterface1 { //Compile時，會自動加上static關鍵字
		void childAMove();
	}
	
	public interface ChildAInnerInterface2 {
		void childAMove1();
	}
	
	@Override
	public Integer getVal() {
		 return 100;
	 }
}
