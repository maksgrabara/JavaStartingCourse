package Exceptions.CheckUncheck;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckUncheck {
    public static void main(String[] args){

        File file = new File("location/text_file.txt");

        try {
            InputStream inputStream = new FileInputStream(file);        //check type exception - must be addressed
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//    NullPointerException, ArrayIndexOutOfBounds - uncheck type exceptions - may be addressed, but it's non-obligatory
}
