package hideojr.practice.ch7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class GenericsTest {

	public static void main(String[] args) {
		Vector<String> obj = new Vector<>();
		obj.add("Hideojr");
		String tmpStr = null;
		for(Iterator it = obj.iterator(); it.hasNext(); System.out.println(tmpStr)) {
			tmpStr = (String)it.next();
		}
		for(Iterator<String> it = obj.iterator(); it.hasNext(); System.out.println(tmpStr)) {
			tmpStr = it.next();
		}
		
		Vector<? super Number> obj1 = new Vector<>(); 
		obj1.add(100); 
		//obj1.add(2.3f); //為何不能使用<? extends Number>, Compile error:The method add(int, capture#1-of ? extends Number) in the type Vector<capture#1-of ? extends Number> is not applicable for the arguments (int)
		
		ArrayList<Integer> dataList = new ArrayList<>();
		dataList.add(100);
		dataList.add(200);
		GenericsTest obj2 = new GenericsTest();
		System.out.println(obj2.showInfo1(dataList));
		
		Vector<Integer> obj3 = new Vector<>();
		Vector obj4 = obj3;
		//Vector<Object> obj5 = obj3; //Compile error:Type mismatch: cannot convert from Vector<Integer> to Vector<Object>
		
		Vector obj6 = new Vector(); //raw type
		obj6.add("Hideojr");
		obj6.add(168);
		Vector<Object> obj7 = new Vector<>();
		obj7.add("Hideojr");
		obj7.add(168);
		Vector<?> obj8 = new Vector<>();
		//obj8.add("Hideojr");
		//obj8.add(168);
	}
	
	public static String showInfo(List<? extends Number> info) {
		Iterator<?> ite = info.iterator(); //Type is Object
		while(ite.hasNext()) {
			//Number num = ite.next(); //Compie error:Type mismatch: cannot convert from capture#4-of ? to Number
		}
		Iterator<? extends Number> ite1 = info.iterator();
		while(ite1.hasNext()) {
			Number num = ite1.next();
		}
		//Iterator<? extends Number> ite = info.iterator(); //legal
		for(Number ele : info) {
			
		}
		return "";
	}

	public <A extends Number> String showInfo1(List<A> info) {
		Iterator<A> ite = info.iterator();
		String lastVal = null;
		for(A ele : info) {
			lastVal = ele.toString();
		}
		//Iterator<A extends Number> ite = info.iterator(); //illegal
		return lastVal;
	}
}
