package Classes.AbstractClass;

public class Cat extends Mammals{
    @Override
    public void NoiseProduced() {
        System.out.println("Meow");
    }

    @Override
    public void Movement() {
        System.out.println("Sneaking around on 4 paws");
    }
}
