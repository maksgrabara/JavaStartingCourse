package Loops;

public class WhileLoop {
    public static void main(String[] args){

        int i = 1;

        while(i <= 9){

            System.out.println("Repetition number " + i);
            i++;

        }

        do{

            System.out.println("Second repetition number " + i);
            i--;

        }while(i >= 0);
    }
}
