package hideojr.practice.ch1;

import static java.lang.System.out;

/**
 * �@���Φh���}�C�ŧi(�j�p)�Ϊ�l��(�t�Ϋ��w�Φۦ���w)
 * @author William
 * @version 1.0
 */
public class Practice_Array {

	@SuppressWarnings(value={"unused"}) //@SuppressWarnings({"unused"}) or @SuppressWarnings("unused")
	public static void main(String[] args) {
		// [�ŧi�@���}�C�覡]
		// �覡1.�ŧi�}�C�j�p�ê�l��
		int[] intAy = new int[2]; // ���A�P����[]�������ťլO�Q���\���A�p int [] intAy = new int[2];
		int intAy1[] = new int[2];
		int []intAy2 = new int[2];
		// �覡2.�ŧi�}�C�j�p�æۦ浹��l��
		int[]intAy3 = { 3, 2, 1, 0 };
		int[] intAy4 = new int[] { 3, 2, 1, 0 };
		Object objAy = new int[] { 1, 2, 3 };
		Object objAy1 = new int[3];
		// Object objAy2 = {1,2,3}; //Compile error:Type mismatch: cannot convert from int[] to Object
		out.println(intAy[1]);
		out.println(intAy3[1]);
		// out.println(intAy[2]); //Runtime exception occurred: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 at hideojr.practice.ch1.Practice_Array.main(Practice_Array.java:27)

		// [�ŧi�h���}�C�覡]
		int[] intMAy[][] = new int[3][][]; //�ܤ֭n��l�Ƥ@���}�C�j�p�A�S�ŧi�@���j�p�e�A��L���ת��}�C��������ŧi�j�p�A����|�X�{"Cannot specify an array dimension after an empty dimension"���~�T��
		int [] intMAy1[][] = { {}, {}, {} }; //{} �@���}�C�ŧi��0���j�p�]��
		int intMAy2[][][] = new int[][][]{{}, {}, {}}; //new int[][][]{} �@���}�C�ŧi��0���j�p�]��
		Object objMAy = new int[3][][];
		
		//�}�C�ƻs
		int intAycopy[] = {1,2,3,4,5};
		System.arraycopy(intAycopy,2, intAycopy, 1, 2);
		out.println(intAycopy[1]);
		out.println(intAycopy[4]);
		//out.println(intAycopy[5]); //runtime exception:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: at hideojr.practice.ch1.Practice_Array.main(Practice_Array.java:40)
	}

}
