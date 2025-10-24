package ConditionalStatements;

public class StatementsTasks {
    public static void main(String[] args){

        int number = 3;

        if(number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        int salary = 1;

        if(salary > 0) {

            if (salary < 85528) System.out.println("Tax: " + (0.17 * salary));

            else {
                double tax = 0.17 * salary;
                int surplus = salary - 85528;
                tax += 0.32 * surplus;
                System.out.println("Tax: " + (tax));
            }

        }

        else System.out.println("Go to work!");

        int a = 5, b = 0, output = 0;
        char operation = '/';

        switch(operation){

            case '+':
                output = a + b;
                break;

            case '-':
                output = a - b;
                break;

            case '*':
                output = a * b;
                break;

            case '/':

                if(b == 0){
                    System.out.println("Division by 0");
                    break;
                }
                output = a/b;
                break;

            default:
                System.out.println("Wrong operation");
        }

        System.out.println(a + " " + operation + " " + b + " = " + output);
    }
}
