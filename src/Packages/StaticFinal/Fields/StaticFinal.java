package Packages.StaticFinal.Fields;

public class StaticFinal {
    public static void main(String[] args){

        ClassStaticFinal object = new ClassStaticFinal();
        object.field = 20;

        ClassStaticFinal.staticInt = 50;
        object.staticInt = 20;      //possible, but not suggested

        ClassStaticFinal.methodStatic();

        System.out.println(ClassStaticFinal.staticInt);

        //object.finalField = 20;       impossible

        System.out.println(object.finalField);

        System.out.println(ClassStaticFinal.some_text);
    }
}
