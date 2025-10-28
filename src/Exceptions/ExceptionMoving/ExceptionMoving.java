package Exceptions.ExceptionMoving;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionMoving {

    public void Method1() throws FileNotFoundException {
        File file = new File("some/address.txt");
        InputStream inputStream = new FileInputStream(file);
    }
}
