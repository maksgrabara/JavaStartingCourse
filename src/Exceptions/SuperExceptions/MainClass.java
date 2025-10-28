package Exceptions.SuperExceptions;

public class MainClass {
    public static void main(String[] args){

        try{
            ThrowException();
        }

        catch(SomeException exception){
            System.out.println("Handling the exception: " + exception.getMessage());
        }
    }

    public static void ThrowException() throws SomeException {
        throw new SomeException("Special message");
    }
}
