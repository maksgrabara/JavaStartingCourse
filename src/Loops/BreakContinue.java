package Loops;

public class BreakContinue {
    public static void main(String[] args) {

        int variable;

        for (variable = 1; variable <= 20; variable++) {

            System.out.println("Before continue " + variable);      //This will still happen!

            if (variable > 18) continue;
            else System.out.println("Variable = " + variable);

        }

        for (int variable2 = 1; variable2 <= 20; variable2++) {

            System.out.println("Before continue " + variable2);     //This again will still happen!

            if (variable2 == 15) break;
            else System.out.println("Variable " + variable2);
        }

//        for(;;)       //This will work just like for(; true ;), infinitely
    }
}
