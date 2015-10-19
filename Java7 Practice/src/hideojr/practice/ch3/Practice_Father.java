package hideojr.practice.ch3;
import static java.lang.System.*; //import static java.lang.System.out;

import java.io.IOException;
import java.util.Calendar;

import hideojr.practice.ch3.sub.Practice_ChildA;
/**
 * 父類別。
 * @author William
 * @version 1.0
 */
@SuppressWarnings({"all","unused"})
public class Practice_Father {
	
	String name = "William";
	
	public static void main(String[] args) {
		Practice_Father obj1 = new Practice_ChildA();
		obj1.showInfo(); //因為子類別沒覆寫該方法，所以還是呼叫自己的方法
		((Practice_ChildA)obj1).showInfo(); //因為將參考強制轉型回子類別，所以是呼叫子類別的方法
		//System.out.println(((Practice_ChildA)obj1).name); //Compile error:The field Practice_ChildA.name is not visible
		System.out.println(obj1.name);
		
		Practice_Father obj2 = new Practice_ChildB();
		obj2.showInfo(); //因為子類別覆寫該方法，所以還是呼叫子類別的方法
		//obj2.saySomething(); //Compile error:The method saySomething() is undefined for the type Practice_Father
		((Practice_ChildB)obj2).saySomething();
		Practice_ChildB obj3 = new Practice_ChildB();
		obj3.showInfo(); //呼叫子類別的方法
		((Practice_Father)obj3).showInfo(); //雖然將參考強制轉型回父類別，但該方法已被子類別覆寫，所以仍是呼叫子類別的方法
		System.out.println(((Practice_Father)obj3).name);
		System.out.println(obj3.name);
		
		Practice_Father outObj = new Practice_Father();
		Practice_Father.InnerClass1 innerOj = outObj.new InnerClass1();
		//Practice_Father.InnerClass1 innerOj1 = new Practice_Father().new InnerClass1(); //legal declaration
	}
	
	 void showInfo() {	//該方法的存取權限為default package，除非繼承的子類別在同一package下(如Practice_ChildB)，不然是不會被覆寫
		System.out.println("I am Practice_Father!");
		return; //無回傳值得方法，也可以適時地在程式中加入以結束方法呼叫
	 }
	 
	 //int showInfo(){} //Compile error:Duplicate method showInfo() in type Practice_Father
	 
	 //public void showInfo(){} //Compile error:Duplicate method showInfo() in type Practice_Father
	 
	 class InnerClass1 {

	 }
	 
	 protected Number getVal() throws Exception {
		 return 100;
	 }
	 
	 static void staticMethod() {}
}
