package Classes.AbstractClass;

public abstract class Mammals {

    public void FeedingOffspring(){
        System.out.println("Feeding with milk");
    }

    public void BodyTemperature(){
        System.out.println("Temperature constant");
    }

    public void NumberOfLimbs(){
        System.out.println("4 limbs");
    }

    public abstract void NoiseProduced();

    public abstract void Movement();
}
