/*
 * [Java�{���ɩw�q���� ]
 * 1.packge ....
 * 2.import [static] ....(0--*)
 * 3.{public | default} class ...(1--*,public��class�ŧi�u�঳�@�ӡA�B�ɦW�Ppublic class name�@�P)
 */
package hideojr.practice.ch1;
import java.util.*;
import static java.lang.System.out;

/**
 * Java���[��(�{���ɩw�q�ε���)
 * ����rconst��goto�S�Q�Φ��O�d�C
 * @author William
 * @version 1.0
 */
@SuppressWarnings("unused") //Annotation
public class Practice_ABasic { //declare statement is "{public | default} class class_name {...}" 
	
	public static String _first;
	
	public static final String _last; //���O�Bfinal�����A���F�b�ŧi�ɴN���ȥ~�A�]�i��ܦb�R�A��l�϶����ȡA���ȫ�N������ܡC
	
	//public static String name = "static"; //Compile error:Duplicate field Practice_ABasic.name

	private String name;
	
	private int age;
	
	private final String job;  //����Bfinal�����A���F�b�ŧi�ɴN���ȥ~�A�]�i��ܦb�����l�϶��άO�غc�l���ȡA���ȫ�N������ܡC
	
	static { //�R�A��l�϶�
		//Practice_ABasic._last = "Ray"; //Compile error:The final field Practice_ABasic._last cannot be assigned
		_last = "Ray";
	}
	
	{ //�����l�϶�
		//this.job = "IT"; //�o�˵��Ȥ]��
		//job = "IT";
	}

	/**
	 * default constructor.
	 */
	public Practice_ABasic() { //default constructor�A�Y�S�ŧi�Acompile�ɡA�t�Ψ�ɷ|�۰ʲ���
		//this.age = -1; //Compile error:Constructor call must be the first statement in a constructor
		this("no name", -1);				
	}
	
	/**
	 * constructor with arguments of name and age.
	 */
	public Practice_ABasic(String name, int age) { //constructor�]��O�@��instance method
		this.name = name;
		this.age = age;
		Practice_ABasic._first = "DEF";
		this.job = "IT";
		//return; //�P�L�^�ǭȪ���k�@�ˡA�i�H�b�{���϶��̥[�Wreturn �׹��l
		if(age > 10)
			return;
		else
			this.age = 30;
	}
	
	/**
	 * bootstrap point.  
	 * @param args
	 */
	public static void main(String[] args) { //static method, declare statement must be "public static void main({String[] args_name | String args_name[]}) [throws Checked Exception] {...}"
		//�o�O�����ѡA���|����java doc
		/*
		 * �o�O�h����ѡA���|����java doc
		 */
		out.println("Hello World!");
		//showInfo(); //Compile error:Cannot make a static reference to the non-static method showInfo() from the type Practice_ABasic
		Practice_ABasic obj = new Practice_ABasic("instance variable", 40);
		obj.showInfo();
	}
	
	public void showInfo() {
		//private static String tmpStr = ""; //local variable�A����[�W�s���׹��l��static �׹��l���i�[final �׹��l�ACompile error:Illegal modifier for parameter tmpStr; only final is permitted
		final String name = "local variable";
		//name = ""; //Compile error:The final local variable name cannot be assigned. It must be blank and not using a compound assignment
		out.println(this.name); //�Y�S���ۦP�W�٪��ϰ��ܼƤ]�S�������ܼƮɡA�h�٬O�|�I�s���O�ܼ�
		out.println(name); //�u�I�s�ܼƦW�ٮɡA�H�N���h�A�Y���ۦP�W�٪��ϰ��ܼơA�h�|�I�s�ϰ��ܼơF�Ϥ��h�|�I�s��������O�ܼ�
		//out.println(Practice_ABasic.name); //Compile error:Cannot make a static reference to the non-static field Practice_ABasic.name
		out.println(Practice_ABasic._last); 
	}

}

