package hideojr.practice.ch3;

import hideojr.practice.ch3.sub.Practice_ChildA;
//import static hideojr.practice.ch3.Practice_Father.staticMethod; //legal
import static hideojr.practice.ch3.Practice_Father.*;

/**
 * ����ɦV���[���C
 * @author William
 * @version 1.0
 */
@SuppressWarnings(value={"unused"})
public class Practice_OO extends Practice_ChildA implements Practice_Interface.InnerInterface {
	
	//�w�]�غc�l���s���v���P���O�@�P
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
				System.out.println("�~�Ӥ@���O�ù�@�䤺������ChildAInnerInterface");				
			}
		};
		iObj.childAMove();
		ChildAInnerInterface1 iObj1 = new ChildAInnerInterface1() {
			public void childAMove() {
				System.out.println("�~�Ӥ@���O�ù�@�䤺������ChildAInnerInterface1");				
			}
		};
		iObj1.childAMove();
		System.out.println(iObj == iObj1);
		System.out.println(Practice_Interface.job);
		//�I�s��H���O���R�A����
		System.out.println(Practice_Abstract.job);
		System.out.println(Practice_Abstract.showJobCat()); 
		
		//�Q��import static �өI�sPractice_Father���O���R�A������k
		staticMethod();
		{
			System.out.println("");
		}
		String str1 = "Hideojr";
		StringBuilder sb1 = new StringBuilder("Hideojr");
		System.out.println(sb1.toString() == str1);
		System.out.println(sb1.equals(str1));
	}
	
	
	private int cal(int pos, int... numbers) { //vararg�Ϊk
		System.out.println(numbers.length);
		int val = 0;
		for(int ele: numbers)
			val += ele;
		return val;
	}
	//private int cal(int... numbers,int pos) { return 0;} //Compile error:The variable argument type int of the method cal must be the last parameter
	//private int cal(int... numbers1,int... numbers2) { return 0;} //Compile error:The variable argument type int of the method cal must be the last parameter�A���y�ܻ��A�ܰʰѼƥu�঳�@��


	@Override
	public void innerAct() {
		// TODO Auto-generated method stub
		
	}


	}