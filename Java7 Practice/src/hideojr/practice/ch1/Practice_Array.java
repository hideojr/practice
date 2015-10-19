package hideojr.practice.ch1;

import static java.lang.System.out;

/**
 * 一維及多維陣列宣告(大小)及初始值(系統指定或自行指定)
 * @author William
 * @version 1.0
 */
public class Practice_Array {

	@SuppressWarnings(value={"unused"}) //@SuppressWarnings({"unused"}) or @SuppressWarnings("unused")
	public static void main(String[] args) {
		// [宣告一維陣列方式]
		// 方式1.宣告陣列大小並初始化
		int[] intAy = new int[2]; // 型態與中刮號[]中間有空白是被允許的，如 int [] intAy = new int[2];
		int intAy1[] = new int[2];
		int []intAy2 = new int[2];
		// 方式2.宣告陣列大小並自行給初始值
		int[]intAy3 = { 3, 2, 1, 0 };
		int[] intAy4 = new int[] { 3, 2, 1, 0 };
		Object objAy = new int[] { 1, 2, 3 };
		Object objAy1 = new int[3];
		// Object objAy2 = {1,2,3}; //Compile error:Type mismatch: cannot convert from int[] to Object
		out.println(intAy[1]);
		out.println(intAy3[1]);
		// out.println(intAy[2]); //Runtime exception occurred: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 at hideojr.practice.ch1.Practice_Array.main(Practice_Array.java:27)

		// [宣告多維陣列方式]
		int[] intMAy[][] = new int[3][][]; //至少要初始化一維陣列大小，沒宣告一維大小前，其他維度的陣列都不能先宣告大小，不能會出現"Cannot specify an array dimension after an empty dimension"錯誤訊息
		int [] intMAy1[][] = { {}, {}, {} }; //{} 一維陣列宣告為0的大小也行
		int intMAy2[][][] = new int[][][]{{}, {}, {}}; //new int[][][]{} 一維陣列宣告為0的大小也行
		Object objMAy = new int[3][][];
		
		//陣列複製
		int intAycopy[] = {1,2,3,4,5};
		System.arraycopy(intAycopy,2, intAycopy, 1, 2);
		out.println(intAycopy[1]);
		out.println(intAycopy[4]);
		//out.println(intAycopy[5]); //runtime exception:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: at hideojr.practice.ch1.Practice_Array.main(Practice_Array.java:40)
	}

}
