package Classes.Interface;

public class Fish implements Animals{

    @Override
    public void Breathing() {
        System.out.println("Gills");
    }

    @Override
    public void Feeding() {
        System.out.println("Worms");
    }

    @Override
    public void Breeding() {
        System.out.println("Roe");
    }
}
