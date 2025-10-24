package Tables;

public class Arrays {
    public static void main(String[] args){

        int[] array;    //array declaration
        array = new int[10];    //array initialization
        array[3] = 155;
        System.out.println(array[0]);

        double[] array2 = new double[5];    //array declaration and initialization
        array2[0] = 12.5;
        System.out.println(array2[0]);

        int[] array3 = {1, 2, 3, 4, 5}; //different initialization
        char[] array4 = {'a', 'b', 'c'};
        System.out.println(array4); //this will work
//        System.out.println(array3); //this won't work, you would need to import import java.util.Arrays; , and use System.out.println(Arrays.toString(array3)); , nothing to bother yourself with for now
        System.out.println(array3.length + " " + array4.length); //length of the tables

    }
}
