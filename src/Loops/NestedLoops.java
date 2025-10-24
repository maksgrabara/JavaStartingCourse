package Loops;

public class NestedLoops {
    public static void main(String[] args) {

        int counter = 0;
        int[][] tabMulti = new int[5][5];

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                counter++;
                tabMulti[i][j] = counter;
                System.out.print("Position - row: " + i + " collumn: " + j + " Value: " + tabMulti[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("Counter: " + counter);


    }
}
