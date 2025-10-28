package Exceptions.TryCatch;

public class TryCatch {
    static String str;
    static int[] tab;
    public static void main(String[] args){

//        str.isEmpty();    this results in an exception


//        str = "text";

//        try{
//            System.out.println(str.isEmpty());      //line which results in exception
//            System.out.println("After try");        //nothing after the faulty line will happen!
//        }
//
//        catch(NullPointerException exception){
//            System.out.println("String is a null");
//        }

        tab = new int[2];

        try{
            tab[0] = 5;
            tab[2] = 5;
        }

        catch(NullPointerException | ArrayIndexOutOfBoundsException exception){
            System.out.println("Something wrong!");
        }



        System.out.println(str);
    }
}
