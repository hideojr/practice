package hideojr.practice.ch9;
import static java.lang.System.*;

public class Practice_String_Buffer_Builder {

	public static void main(String[] args) {
		//String
		String str1 = "Hideojr";
		String str2 = new String("Hideojr");
		System.out.println(str1==str2); //-->false
		System.out.println(str1.equals(str2)); //-->true
		System.out.println(str1.intern()==str2.intern()); //-->true 意思是JVM會在字串池中找尋獲添加該字串
		//StringBuffer:thread safe; StringBuilder:no-thread safe
		StringBuilder obj = new StringBuilder("Java ");
		obj.append("7.0");
		System.out.println(obj);
		System.out.println(obj.substring(0,5));
		System.out.println(obj);
		System.out.println(obj.replace(0, 5, "Oracle Java "));
		System.out.println(obj);
		System.out.println(obj.delete(0, 7));
		out.println(obj);
		
		//out.println("Java 7 certification".substring(7).delete(0,2)); //Compile error:The method delete(int, int) is undefined for the type String
	}

}
