package Packages.StaticFinal.Fields;

public class ClassStaticFinal {
    public int field;       //cannot be statically modified (already assigned to an existing object)
    public static int staticInt;        //accessible without creating an object

    public static void methodStatic(){

        System.out.println("Static method");
    }

    public final int finalField = 220;       //just like const in C++, value cannot be changed after declaration

    public static final String some_text = "Some text";     //new naming convention!
}
