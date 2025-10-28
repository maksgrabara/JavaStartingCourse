package Exceptions.CreatingExceptions;

public class User {

    public void inputPassword(String password) throws CreatingExceptions{
        if(!password.contains("Covert")) throw new CreatingExceptions();
    }

    public void inputEmail(String email){       //no need in handling the exception ourselves
        if(!email.contains("@")) throw new WrongEmailException();
    }
}
