package Tables;

public class TablesTasks {
    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Sum = " + (array[0] + array[1] + array[2] + array[3] + array[4]));

        double[][] tableMulti = {{1.1, 1.2, 1.3, 1.4, 1.5}, {2.1, 2.2, 2.3, 2.4, 2.5}, {3.1, 3.2, 3.3, 3.4, 3.5}};

        System.out.println("First row sum = " + (tableMulti[0][0] + tableMulti[0][1] + tableMulti[0][2] + tableMulti[0][3] + tableMulti[0][4]));
        System.out.println("Second row sum = " + (tableMulti[1][0] + tableMulti[1][1] + tableMulti[1][2] + tableMulti[1][3] + tableMulti[1][4]));
        System.out.println("Third row sum = " + (tableMulti[2][0] + tableMulti[2][1] + tableMulti[2][2] + tableMulti[2][3] + tableMulti[2][4]));
    }
}
