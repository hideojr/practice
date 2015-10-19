package hideojr.practice.ch9;

/**
 * Autoboxing and Unboxing¦boverloading methodªº§PÂ_
 * @author ray
 *
 */
public class Practice_Primitive {

	public static void main(String[] args) {
		Integer i = 100; //Compiler will gencode to Integer i = Integer.valueof(100);
		int j = 200; 
		foo(i);
		foo(j);
	}
	
	static void foo(int x) {
		System.out.println("int x = " + x);
	}
	
	static void foo(Double x) {
		System.out.println("Double x = " + x);
	}

}
