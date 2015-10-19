package hideojr.cert;

public class Cert_Polymorphism {

	public static void main(String[] args) {
		MySuper obj1 = new MyChild();
		MyChild obj2 = (MyChild)obj1;
		MyChild obj3 = new MyChild();
		showClass(obj1);
		showClass(obj2);
		showClass((MyInterface)obj3);
	}

	static void showClass(Object obj) {
		System.out.println(obj.getClass().getName());
	}
}

interface MyInterface {
	void showMsg();
}

class MySuper {
	protected void showMsg() {
		System.out.println("Invoking from MySuper");
	}
}

class MyChild extends MySuper implements MyInterface {
	public void showMsg() {
		System.out.println("Invoking from MyChild");
	}
}