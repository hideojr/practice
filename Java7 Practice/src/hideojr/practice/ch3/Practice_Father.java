package hideojr.practice.ch3;
import static java.lang.System.*; //import static java.lang.System.out;

import java.io.IOException;
import java.util.Calendar;

import hideojr.practice.ch3.sub.Practice_ChildA;
/**
 * �����O�C
 * @author William
 * @version 1.0
 */
@SuppressWarnings({"all","unused"})
public class Practice_Father {
	
	String name = "William";
	
	public static void main(String[] args) {
		Practice_Father obj1 = new Practice_ChildA();
		obj1.showInfo(); //�]���l���O�S�мg�Ӥ�k�A�ҥH�٬O�I�s�ۤv����k
		((Practice_ChildA)obj1).showInfo(); //�]���N�Ѧұj���૬�^�l���O�A�ҥH�O�I�s�l���O����k
		//System.out.println(((Practice_ChildA)obj1).name); //Compile error:The field Practice_ChildA.name is not visible
		System.out.println(obj1.name);
		
		Practice_Father obj2 = new Practice_ChildB();
		obj2.showInfo(); //�]���l���O�мg�Ӥ�k�A�ҥH�٬O�I�s�l���O����k
		//obj2.saySomething(); //Compile error:The method saySomething() is undefined for the type Practice_Father
		((Practice_ChildB)obj2).saySomething();
		Practice_ChildB obj3 = new Practice_ChildB();
		obj3.showInfo(); //�I�s�l���O����k
		((Practice_Father)obj3).showInfo(); //���M�N�Ѧұj���૬�^�����O�A���Ӥ�k�w�Q�l���O�мg�A�ҥH���O�I�s�l���O����k
		System.out.println(((Practice_Father)obj3).name);
		System.out.println(obj3.name);
		
		Practice_Father outObj = new Practice_Father();
		Practice_Father.InnerClass1 innerOj = outObj.new InnerClass1();
		//Practice_Father.InnerClass1 innerOj1 = new Practice_Father().new InnerClass1(); //legal declaration
	}
	
	 void showInfo() {	//�Ӥ�k���s���v����default package�A���D�~�Ӫ��l���O�b�P�@package�U(�pPractice_ChildB)�A���M�O���|�Q�мg
		System.out.println("I am Practice_Father!");
		return; //�L�^�ǭȱo��k�A�]�i�H�A�ɦa�b�{�����[�J�H������k�I�s
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
