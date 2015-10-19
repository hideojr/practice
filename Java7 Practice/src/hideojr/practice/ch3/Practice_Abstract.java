package hideojr.practice.ch3;

public abstract class Practice_Abstract {
	public static String job;
	static {
		job = "IOT";
	}
	public static String showJobCat() {
		//return job;
		return Practice_Abstract.job;
	}
}
