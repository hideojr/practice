package hideojr.practice.ch3.sub;

import java.io.IOException;

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
		return; //�L�^�ǭȱo��k�A�]�i�H�A�ɦa�b�{�����[�J�H������k�I�s
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
