package hideojr.practice.ch2;

@SuppressWarnings("unused")
public class Practice_ControlFlow {

	private static final int var1 = 10;
	private static final long var3 = 15;
	
	public static void main(String[] args) {
		final int var2 = 20; //local variable
		//switch-case,支援char/byte/short/int/Wrapper Classes/Enum Type/String，基本上都轉成int來比對，若比對子有變數的話，只能放置宣告為final的全域或區域變數
		byte byte1 = 6;
		switch(byte1) {
		case 1:
			System.out.println(1);
			break;
		case 4:
			System.out.println(4);
			break;
		case var2:
			System.out.println(var2);
			break;
		case var1:
			System.out.println(var1);
			break;
		/*
		case var3: //Compile error:Type mismatch: cannot convert from long to byte
			System.out.println(var3);
			break;
		*/
		case 'A':
			System.out.println((int)'A');
			break;
		}
		//for loop for(initializaion(can use,);booleab-expresson;stepping(can use,))
		//for(int i = 0, int j=0;;){} //Compile error: Syntax error on token "int", delete this token
		
		//for(int i = 0, long j=0;;){} //Compile error: Syntax error on token "long", delete this token
		
		//int i = 0;
		//for(i = 0,int j=0;;){} //Compile error: Syntax error on token "int", delete this token
		
		int i = 0;
		long j;
		for(i = 10, j=1;j < i; i++,j+=2){} //Compile error: Syntax error on token "int", delete this token
		//for-each 針對陣列(array)及Collection類別
		String[] strAy = {"C#", "C", "C++","Java"};
		for(String ele : strAy)
			System.out.println(ele);
		System.out.println(strAy.getClass().getSuperclass().getName());
		//while-loop
		while(true) {
			break;			
		}
		//do while-loop
		do {
			break;			
		} while(true);
	}

}
