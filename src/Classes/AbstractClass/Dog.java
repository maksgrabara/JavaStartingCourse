package Classes.AbstractClass;

public class Dog extends Mammals{


    @Override
    public void NoiseProduced() {
        System.out.println("Woof");
    }

    @Override
    public void Movement() {
        System.out.println("Running on 4 legs");
    }
}
