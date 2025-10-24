package Loops;

public class LoopsAndTables {
    public static void main(String[] args) {

        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++){

            tab[i] = i * 2;
            System.out.println("Position " + i  + " in tab: " + tab[i]);

        }
    }
}
