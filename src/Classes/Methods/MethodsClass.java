package Classes.Methods;

public class MethodsClass {

    void MethodOutput() {
        System.out.println("Value output");
    }

    void MethodArgument(int number, char character){
        number++;
        character++;
        System.out.println("Number: " + number + " Character: " + character);
    }

    void ShowOrNot(boolean whetherShow, int value){
        if(whetherShow) System.out.println("Covert value: " + value);
        else System.out.println("Nuh uh.");
    }

    int Sum(int a, int b){
        return (a + b);
    }

    double SumDouble(double c){
        return (c + 0.55);
    }

    boolean Logic(boolean d){
        return !d;
    }
}
