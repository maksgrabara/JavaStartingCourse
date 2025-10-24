package Classes.Constructors;

public class Constructors {
    public static void main(String[] args) {

        ConstructorsClass constructor = new ConstructorsClass(10);
        System.out.println(constructor.first + " " + constructor.second);
        constructor.first = 15;
        constructor.second = 20;
        System.out.println(constructor.first + " " + constructor.second);

    }
}
