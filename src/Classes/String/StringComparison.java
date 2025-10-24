package Classes.String;

public class StringComparison {
    public static void main(String[] args){

        String string1 = "text";
        String string2 = "text";

        System.out.println(string1 == string2);     //== symbol checks references to places in memory

        String string3 = new String("New text");
        String string4 = new String("New text");

        System.out.println(string3 == string4);     //different places in memory!

        System.out.println(string3.equals(string4));        //we use equals() when comparing strings
    }
}
