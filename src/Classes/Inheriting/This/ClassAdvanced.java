package Classes.Inheriting.This;

public class ClassAdvanced {

    int x, y;

    ClassAdvanced(){

        System.out.println("No parameter constructor");
    }

    ClassAdvanced(int a){

        System.out.println("Constructor with a parameter " + a);
    }

    ClassAdvanced(int a, int b){
        this(a);
        x = a;
        y = b;
        System.out.println("Constructor with 2 parameters: " + a + " " + b);
    }
}
