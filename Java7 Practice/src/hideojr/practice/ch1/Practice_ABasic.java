/*
 * [Java程式檔定義順序 ]
 * 1.packge ....
 * 2.import [static] ....(0--*)
 * 3.{public | default} class ...(1--*,public的class宣告只能有一個，且檔名與public class name一致)
 */
package hideojr.practice.ch1;
import java.util.*;
import static java.lang.System.out;

/**
 * Java基本觀念(程式檔定義及註解)
 * 關鍵字const及goto沒被用但保留。
 * @author William
 * @version 1.0
 */
@SuppressWarnings("unused") //Annotation
public class Practice_ABasic { //declare statement is "{public | default} class class_name {...}" 
	
	public static String _first;
	
	public static final String _last; //類別且final成員，除了在宣告時就給值外，也可選擇在靜態初始區間給值，給值後就不能改變。
	
	//public static String name = "static"; //Compile error:Duplicate field Practice_ABasic.name

	private String name;
	
	private int age;
	
	private final String job;  //實體且final成員，除了在宣告時就給值外，也可選擇在實體初始區間或是建構子給值，給值後就不能改變。
	
	static { //靜態初始區間
		//Practice_ABasic._last = "Ray"; //Compile error:The final field Practice_ABasic._last cannot be assigned
		_last = "Ray";
	}
	
	{ //實體初始區間
		//this.job = "IT"; //這樣給值也行
		//job = "IT";
	}

	/**
	 * default constructor.
	 */
	public Practice_ABasic() { //default constructor，若沒宣告，compile時，系統其時會自動產生
		//this.age = -1; //Compile error:Constructor call must be the first statement in a constructor
		this("no name", -1);				
	}
	
	/**
	 * constructor with arguments of name and age.
	 */
	public Practice_ABasic(String name, int age) { //constructor也算是一種instance method
		this.name = name;
		this.age = age;
		Practice_ABasic._first = "DEF";
		this.job = "IT";
		//return; //與無回傳值的方法一樣，可以在程式區塊裡加上return 修飾子
		if(age > 10)
			return;
		else
			this.age = 30;
	}
	
	/**
	 * bootstrap point.  
	 * @param args
	 */
	public static void main(String[] args) { //static method, declare statement must be "public static void main({String[] args_name | String args_name[]}) [throws Checked Exception] {...}"
		//這是單行註解，不會產生java doc
		/*
		 * 這是多行註解，不會產生java doc
		 */
		out.println("Hello World!");
		//showInfo(); //Compile error:Cannot make a static reference to the non-static method showInfo() from the type Practice_ABasic
		Practice_ABasic obj = new Practice_ABasic("instance variable", 40);
		obj.showInfo();
	}
	
	public void showInfo() {
		//private static String tmpStr = ""; //local variable，不能加上存取修飾子及static 修飾子但可加final 修飾子，Compile error:Illegal modifier for parameter tmpStr; only final is permitted
		final String name = "local variable";
		//name = ""; //Compile error:The final local variable name cannot be assigned. It must be blank and not using a compound assignment
		out.println(this.name); //若沒有相同名稱的區域變數也沒有實體變數時，則還是會呼叫類別變數
		out.println(name); //只呼叫變數名稱時，以就近原則，若有相同名稱的區域變數，則會呼叫區域變數；反之則會呼叫實體或類別變數
		//out.println(Practice_ABasic.name); //Compile error:Cannot make a static reference to the non-static field Practice_ABasic.name
		out.println(Practice_ABasic._last); 
	}

}

