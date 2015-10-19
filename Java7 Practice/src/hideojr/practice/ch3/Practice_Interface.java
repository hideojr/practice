package hideojr.practice.ch3;

interface Practice_Interface { //��@�����O�@�ˡA�u��ŧi��public��default
	
	//protected interface InnerInterface1 { //Compile error:The interface member type InnerInterface1 can only be public
	 interface InnerInterface1 { //Compile�ɡA�|�۰ʸ�public static

	}
	//private static final String name = "Hideojr"; //Compile error:Illegal modifier for the interface field Practice_Interface.name; only public, static & final are permitted
	//protected static final String name = "Hideojr"; //Compile error:Illegal modifier for the interface field Practice_Interface.name; only public, static & final are permitted
	//public static final String name; //Compile error:The blank final field name may not have been initialized
	public static final String name = "Hideojr";
	String job = "IT"; //Compile�ɴ��|�۰ʬ��ܼƥ[�Wpublic static final
	
	//private void move(); //Compile error:Illegal modifier for the interface method move; only public & abstract are permitted
	//protected void move(); //Compile error:Illegal modifier for the interface method move; only public & abstract are permitted
	public abstract void move();
	void skill(); //Compile�ɴ��|�۰ʬ��ܼƥ[�Wpublic abstract
	public interface InnerInterface {
		void innerAct();
	}
}

/*
// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Practice_Interface.java

package hideojr.practice.ch3;


public interface Practice_Interface
{

    public abstract void move();

    public abstract void skill();

    public static final String name = "Hideojr";
    public static final String job = "IT";
}
*/