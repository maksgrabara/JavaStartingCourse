package Exceptions.ExceptionMoving;

import java.io.FileNotFoundException;

public class MainClass {
    public static void main(String[] args){

        ExceptionMoving object1 = new ExceptionMoving();

        try {
            object1.Method1();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
