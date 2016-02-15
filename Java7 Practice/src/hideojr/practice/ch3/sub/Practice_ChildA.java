package hideojr.practice.ch3.sub;

import hideojr.practice.ch3.Practice_Father;

/**
 * �l���O�C
 * @author William
 * @version 1.0
 */
public class Practice_ChildA extends Practice_Father {
	
	String name = "Ray";
	
	//Compile warning:The method Practice_ChildA.showInfo() does not override the inherited method from Practice_Father since it is private to a different package
	public void showInfo() {	 //�Ӥ�k�P�����O��showInfo��k�O�S���мg���Y���A�i��Annotation @Override���A�ˬd
		System.out.println("I am Practice_ChildA!");
		System.out.println("I am Practice_ChildA " + name1);
		return; //�L�^�ǭȱo��k�A�]�i�H�A�ɦa�b�{�����[�J�H������k�I�s
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
	
	protected static interface ChildAInnerInterface1 { //Compile�ɡA�|�۰ʥ[�Wstatic����r
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
