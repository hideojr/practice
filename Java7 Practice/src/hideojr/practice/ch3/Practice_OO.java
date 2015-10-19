package hideojr.practice.ch3;

import hideojr.practice.ch3.sub.Practice_ChildA;
//import static hideojr.practice.ch3.Practice_Father.staticMethod; //legal
import static hideojr.practice.ch3.Practice_Father.*;

/**
 * 物件導向基本觀念。
 * @author William
 * @version 1.0
 */
@SuppressWarnings(value={"unused"})
public class Practice_OO extends Practice_ChildA implements Practice_Interface.InnerInterface {
	
	//預設建構子的存取權限與類別一致
	public Practice_OO() {
		this.sex = "M";
		
	}
	static {
		_name = "Ray";
	}
	
	{
		this.name ="Patric";
		
	}

	public static String _name;
	private String name;
	protected String sex;
	public static void main(String[] args) {
		Practice_OO obj = new Practice_OO();
		System.out.println(obj.cal(1, 18,27,29,21));
		Practice_ChildA.ChildAInnerInterface iObj = new Practice_ChildA.ChildAInnerInterface() {
			public void childAMove() {
				System.out.println("繼承一類別並實作其內部介面ChildAInnerInterface");				
			}
		};
		iObj.childAMove();
		ChildAInnerInterface1 iObj1 = new ChildAInnerInterface1() {
			public void childAMove() {
				System.out.println("繼承一類別並實作其內部介面ChildAInnerInterface1");				
			}
		};
		iObj1.childAMove();
		System.out.println(iObj == iObj1);
		System.out.println(Practice_Interface.job);
		//呼叫抽象類別的靜態成員
		System.out.println(Practice_Abstract.job);
		System.out.println(Practice_Abstract.showJobCat()); 
		
		//利用import static 來呼叫Practice_Father類別的靜態成員方法
		staticMethod();
		{
			System.out.println("");
		}
		String str1 = "Hideojr";
		StringBuilder sb1 = new StringBuilder("Hideojr");
		System.out.println(sb1.toString() == str1);
		System.out.println(sb1.equals(str1));
	}
	
	
	private int cal(int pos, int... numbers) { //vararg用法
		System.out.println(numbers.length);
		int val = 0;
		for(int ele: numbers)
			val += ele;
		return val;
	}
	//private int cal(int... numbers,int pos) { return 0;} //Compile error:The variable argument type int of the method cal must be the last parameter
	//private int cal(int... numbers1,int... numbers2) { return 0;} //Compile error:The variable argument type int of the method cal must be the last parameter，換句話說，變動參數只能有一個


	@Override
	public void innerAct() {
		// TODO Auto-generated method stub
		
	}


	}