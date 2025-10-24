package Tables;

public class MultiDimensionalTables {
    public static void main(String[] args){

        int[][] tableMulti = new int[5][5];
        tableMulti[3][0] = 7;

        System.out.println(tableMulti[3][0]);

        int[][] tableMulti2 = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11}};

        System.out.println(tableMulti2.length); //only rows counted
        System.out.println(tableMulti2[0].length);  //only columns counted
    }
}
