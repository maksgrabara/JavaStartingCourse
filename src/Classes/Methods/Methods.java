package Classes.Methods;

public class Methods {
    public static void main(String[] args) {

        MethodsClass Object1 = new MethodsClass();
        Object1.MethodOutput();

        MethodsClass Object2 = new MethodsClass();
        Object2.MethodArgument(5, 'b');

        MethodsClass Object3 = new MethodsClass();
        Object3.ShowOrNot(true, 10);

        MethodsClass Object4 = new MethodsClass();
        int SumVariable = Object4.Sum(5, 10);
        System.out.println("Sum as variable = " + SumVariable);

        MethodsClass Object5 = new MethodsClass();
        double DoubleVariable = Object5.SumDouble(10.21);
        System.out.println("Double as variable = " + DoubleVariable);

        MethodsClass Object6 = new MethodsClass();
        boolean LogicVariable = Object6.Logic(true);
        System.out.println("Boolean negated = " + LogicVariable);
    }
}
