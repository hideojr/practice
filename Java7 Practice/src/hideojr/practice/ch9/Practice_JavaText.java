package hideojr.practice.ch9;

import java.text.*;
import java.util.*;

public class Practice_JavaText {

	public static void main(String[] args) {
		//NumberFormat:abstract class
		double val = .905_87;
		DecimalFormat fmt = new DecimalFormat("#.##%");
		System.out.println(fmt.format(val));
		double val1 = 68_999.905_87;
		DecimalFormat fmt1 = new DecimalFormat("###,000.##");
		System.out.println(fmt1.format(val1));
		//DateFormat
		DateFormat dmt = DateFormat.getDateInstance(DateFormat.FULL, Locale.TAIWAN);
		System.out.println(dmt.format(new Date()));
		System.out.println(dmt.format(new Date(0)));
	}

}
