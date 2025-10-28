package Exceptions.Finally;

public class Finally {
    static String str = "some text here";
    public static void main(String[] args){


        try{
            System.out.println("All in upperCase " + str.toUpperCase());
            System.out.println(str.charAt(100));
        }

        catch(NullPointerException exception){
            System.out.println("String is a null");
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Out of bounds");
        }

        finally {
            System.out.println("Finally is always gonna work");
        }
    }
}
