package Classes.Inheriting.Super;

public class ClassDefault {

    int field1;

    void method1(){
        System.out.println("Class Default");
    }

    ClassDefault(){
        System.out.println("Default constructor");
    }

    ClassDefault(int a){
        System.out.println("Default constructor with parametr " + a);
    }
}
