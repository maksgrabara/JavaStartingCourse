package ConditionalStatements;

public class IfInstruction {
    public static void main(String[] args){

        int age = 15;
        boolean supervisor = true;

        if(age >= 18){
            System.out.println("Condition met");
        }
        else if(supervisor == true) System.out.println("Condition met");
        else System.out.println("Condition not met");
    }
}
