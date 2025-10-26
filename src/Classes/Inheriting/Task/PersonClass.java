package Classes.Inheriting.Task;

public class PersonClass {
    protected String name, surname;


    public PersonClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void introduceMe() {
        System.out.printf("I'm " + name + " " + surname);
    }
}