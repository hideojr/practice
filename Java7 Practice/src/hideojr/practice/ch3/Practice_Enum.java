package hideojr.practice.ch3;

public enum Practice_Enum {
	One {
		@Override
		public String toString() { return "1";}
	},Two,Three
}
/*
// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Practice_Enum.java

package hideojr.practice.ch3;


public final class Practice_Enum extends Enum
{

    private Practice_Enum(String s, int i)
    {
        super(s, i);
    }

    public static Practice_Enum[] values()
    {
        Practice_Enum apractice_enum[];
        int i;
        Practice_Enum apractice_enum1[];
        System.arraycopy(apractice_enum = ENUM$VALUES, 0, apractice_enum1 = new Practice_Enum[i = apractice_enum.length], 0, i);
        return apractice_enum1;
    }

    public static Practice_Enum valueOf(String s)
    {
        return (Practice_Enum)Enum.valueOf(hideojr/practice/ch3/Practice_Enum, s);
    }

    public static final Practice_Enum One;
    public static final Practice_Enum Two;
    public static final Practice_Enum Three;
    private static final Practice_Enum ENUM$VALUES[];

    static 
    {
        One = new Practice_Enum("One", 0);
        Two = new Practice_Enum("Two", 1);
        Three = new Practice_Enum("Three", 2);
        ENUM$VALUES = (new Practice_Enum[] {
            One, Two, Three
        });
    }
}
*/