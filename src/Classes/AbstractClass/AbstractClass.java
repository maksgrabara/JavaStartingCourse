package Classes.AbstractClass;

public class AbstractClass {
    public static void main(String[] args){

        AbstractImplementation object1 = new AbstractImplementation();
        object1.AbstractMethod();
        object1.AbstractReturnMethod("Hello");
        object1.Method1();

        Dog dog = new Dog();
        dog.Movement();

        Cat cat = new Cat();
        cat.NoiseProduced();

    }
}
