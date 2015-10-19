package hideojr.practice.ch1;

public class Practice_Primitive {

	public static void main(String[] args) {
		//char 2bytes/16bits/\u0000~\uFFFF(0~65535)/default \u0000 
		//Java7�}�l��unicode 6.0�s�X
		char char1 = '\u4E2D'; //'\u4e2d'�p�g�]��
		System.out.println(char1);
		char char2 = 20013; 
		System.out.println(char2);
		System.out.println('\\');
		System.out.println("|"+'\0'+"|");
		//byte 1byte/8bits/-2��7����~2��7����-1/default 0
		byte byte1 = 'A'; //�r���H���W�Xbyte���ƭȽd��N���|��compile error
		System.out.println(byte1);
		//short 2bytes/16bits/-2��15����~2��15����-1/default 0
		short short1 = 'A'; //'\u0041'=A,�r���H���W�Xbyte���ƭȽd��N���|��compile error
		System.out.println(short1);
		short short2 = 1_000;
		System.out.println(short2);
		short short3 = 1_0_00;
		System.out.println(short3);
		short short4 = 0b11001;
		System.out.println(short4);
		short short5 = 0x141;
		System.out.println(short5);
		//int 4byte/32bits/-2��31����~2��31����-1/default 0		
		//long 8byte/64bits/-2��63����~2��63����-1/default 0L/l
		//float 4byte/32bits/-3.4E+38~3.4E+38/default 0.0F/f
		float float1 = 'A'; //'\u0041'=A,�r���H���W�Xbyte���ƭȽd��N���|��compile error
		System.out.println(float1);
		float float2 = (float)3.5; //�B�I�ƹw�]��double�A�n����l�ȫŧi�M���αj���૬�ACompile error:Type mismatch: cannot convert from double to float
		System.out.println(float2);
		//double 8byte/64bits/-1.7E+308~1.7E+308/default 0.0D/d
		//boolean VM decided/VM decided/true or false/default false
		//boolean boolean1 = 1; //�u�൹true or false�ACompile error:Type mismatch: cannot convert from int to boolean
		boolean boolean1 = true; 
		System.out.println(boolean1);
		
		int result = (int)((13.0/7)*2+1);
		System.out.println(result);
	}

}
