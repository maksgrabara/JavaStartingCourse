package Packages.Tasks.Third;

import static java.lang.Math.pow;

public class TaskThirdClass {

    private static final double pi = 3.14;

    public static SupportClass circle(int r){

        SupportClass object1 = new SupportClass();
        object1.circuit = 2 * pi * r;
        object1.area = pi * pow(r, 2);

        return object1;
    }

    public static SupportClass rectangle(int a, int b){

        SupportClass object2 = new SupportClass();
        object2.circuit = 2 * a + 2 * b;
        object2.area = a * b;

        return object2;
    }

}
