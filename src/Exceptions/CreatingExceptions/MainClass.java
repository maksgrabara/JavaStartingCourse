package Exceptions.CreatingExceptions;

public class MainClass {
    public static void main(String[] args){

        User user = new User();

        try {
            user.inputEmail("john.smith@gmail.com");
            user.inputPassword("qwerty123Covert");
            System.out.println("Everything alright");
        }

        catch (CreatingExceptions exception) {
            System.out.println("Password not strong enough");
        }

        catch (WrongEmailException exception){
            System.out.println("Email doesn't contain the @");
        }
    }
}
