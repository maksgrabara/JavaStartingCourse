package Exceptions.Tasks;
import static java.lang.Math.pow;

public class Task {
    public static void main(String[] args){

        int a = 5, b = 10;

//        try{
//            System.out.println(a/b);
//        }
//
//        catch(ArithmeticException exception){
//            System.out.println("Division by 0 is not permitted!");
//        }

        try{
            System.out.println(ShowOutput(a, b));
            System.out.println(CircleOutput(-5));
        }

        catch(CheckExceptionClass exception){
            System.out.println(exception.getMessage());
        }

        catch(ArithmeticException exception){
            System.out.println(exception.getMessage());
        }

    }

    public static int ShowOutput(int a, int b) throws CheckExceptionClass {
        if(b == 0) throw new CheckExceptionClass("Division by 0 is not permitted!");
        else return a/b;
    }

    public static double CircleOutput(int r){
        if(r < 0) throw new UncheckExceptionClass("Negative circle radius!");
        else return (3.14 * r);
    }
}
