package hideojr.practice.ch7;

import java.util.*;
import java.util.regex.*;

public class Practice_Collections {
	Integer x = 1;
	
	Practice_Collections(final String name) {
		
	}
	
	void go(Integer i) {
		System.out.println(x + ++i);
	}

	public static void main(String[] args) {
		new Practice_Collections("").go(5);
		
		Deque<String> myDeque = new ArrayDeque<>();
		myDeque.push("One");
		myDeque.push("Two");
		myDeque.push("Three");
		System.out.println(myDeque.pop());
		Deque<String> myDeque1 = new ArrayDeque<>();
		myDeque1.add("One");
		myDeque1.add("Two");
		myDeque1.add("Three");
		System.out.println(myDeque1.remove());
		
		Map<String,String> partList = new TreeMap<>();
		partList.put("P002","L");
		partList.put("P001","W");
		partList.put("P002","X");
		Set<String> keys = partList.keySet();
		for(String key: keys)
			System.out.println(key);
		
		Pattern p = Pattern.compile("Java.+\\d");
		Matcher m = p.matcher("Java 7, Java 6");
		//System.out.println(m.replaceAll(","));
		while(m.find())
			System.out.println(m.group());
		System.out.println("Java 7, Java 6".replaceAll("Java", "Jawa"));
	}
}
