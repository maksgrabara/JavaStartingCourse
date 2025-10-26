package Classes.Inheriting.Super;

public class ClassAdvanced extends ClassDefault{

    @Override
    void method1() {
        super.method1();
        System.out.println("Class Advanced");
    }

    ClassAdvanced(){
        super(5);
        System.out.println("Advanced constructor");
    }
}
