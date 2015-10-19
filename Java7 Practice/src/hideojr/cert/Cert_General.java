package hideojr.cert;

import java.util.ArrayList;
import java.util.List;

public class Cert_General {
	private int age = 0;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Cert_General obj = new Cert_General();
		obj.age = 40; //在自己的class裡產生自己的實體，仍可透過該實體變數存取private變數
		System.out.println(obj.age);
		//考題一(這題我答對)
		int[] pAy = {5,6,7,8,9};
		for(int i : pAy) {
			System.out.print(i + ",");
			i++; //不影響iterator的運算指定
		}
		//考題二(這題我答錯)
		int sum = 0; //Compile error:The local variable sum may not have been initialized
		int val = 5;
		do {
			sum += val;
		} while((val--) > 1); //val--與(val--)是一樣的
		System.out.println("The sum is " + sum);
		int x = 5;
		int y = (x--);
		System.out.println("The y is " + y);
		//考題三(這題我答對)
		int i = 10;
		int j = 2;
		int k = i;
		int l = j += 2 * i;
		System.out.println("The j is " + j);
		System.out.println("The l is " + l);
		//考題四(這題我答對)
		int count = 10;
		if(count > 20) {
			count --;
			//break; //Compile error:break cannot be used outside of a loop or a switch
		}
		else
			System.out.println("The count is " + count);
		//考題五(這題我答錯)
		ArrayList<GenericSuper> listObj = new ArrayList<GenericSuper>();
		listObj.add(new GenericSuper());
		listObj.add(new GenericChild());
		ArrayList<Number> listObj1 = new ArrayList<>();
		listObj1.add(100);
		listObj1.add(100.68f);
		ArrayList<Integer> listObj2 = new ArrayList<>();
		//ArrayList<Number> listObj3 = listObj2; //Compile error:Type mismatch: cannot convert from ArrayList<Integer> to ArrayList<Number>
		List<Integer> listObj3 = listObj2;
		//考題六(這題我答對)
		//dealData("SE","EE","ME"); //Compile error:The method dealData(String[]) in the type Cert_General is not applicable for the arguments (String, String, String)
		//考題七(這題我答對)
		ArrayList listObj4 = new ArrayList();
		String tmpStr1 = "SE";
		String tmpStr2 = new String("SE");
		Object tmpStr3 = "SE";
		listObj4.add("SE");
		listObj4.add("ME");
		listObj4.add("EE");
		listObj4.add("SE");
		System.out.println(listObj4.contains(tmpStr1));
		System.out.println(listObj4.contains(tmpStr2));
		System.out.println(listObj4.contains(tmpStr3));
		//考題八(這題我答錯)
		listObj4.remove(tmpStr1); //Removes the first occurrence of the specified element from this list
		System.out.println(listObj4.size()); //=3
	}

	public static void dealData(String[] data) {
		//do nothing
	}
}

class GenericSuper {
	public void showData() {
		Cert_General obj = new Cert_General();
		//obj.age = 40; //Compile error:The field Cert_General.age is not visible
		//System.out.println(obj.age); //Compile error:The field Cert_General.age is not visible
	}
}

class GenericChild extends GenericSuper {
	
}
