package hideojr.practice.ch3;

import hideojr.practice.ch3.Practice_Father;

/**
 * �l���O�C
 * @author William
 * @version 1.0
 */
public class Practice_ChildB extends Practice_Father {
	
	String name = "Ray";
	
	@Override
	public void showInfo() {	 //�Ӥ�k�P�����O��showInfo��k�O�S���мg���Y���A�i��Annotation @Override���A�ˬd
		System.out.println("I am Practice_ChildB!");
		return; //�L�^�ǭȱo��k�A�]�i�H�A�ɦa�b�{�����[�J�H������k�I�s
	}
	
	public void saySomething() {
		System.out.println("Hello, World!");		
	}

}
