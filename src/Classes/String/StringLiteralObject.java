package Classes.String;

public class StringLiteralObject {
    public static void main(String[] args){

        String string1 = "some string";
        String string2 = "some string";     //the very same thing in memory, no second string created

        String string3 = new String("Wow what is this?");       //redundant, if I created second same string it would create second instance in memory, unless access to the original string is needed

    }
}
