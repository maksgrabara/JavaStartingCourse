package Packages.Null;

public class Null {
    static String string1;
    static String string2 = new String("Hello");
    public static void main(String[] args){

        if(string1 == null) System.out.println("Null");

        //string.isEmpty();     string is a null, cannot be operated on, in other words, an object hasn't been created

        System.out.println(string2.isEmpty());
    }
}
