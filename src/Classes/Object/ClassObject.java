package Classes.Object;

public class ClassObject {
    public static void main(String[] args){

        Object object1 = new Object();

        ClassAdvanced object2 = new ClassAdvanced();

        object2.method1(60);
        object2.method2();

        ClassDefault object3 = (ClassDefault) object2;
        object3.method2();
    }
}
