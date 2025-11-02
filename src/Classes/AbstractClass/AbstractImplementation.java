package Classes.AbstractClass;

public class AbstractImplementation extends OtherClass{

    @Override
    public void AbstractMethod() {
        System.out.println("Abstract text here");
    }

    @Override
    public int AbstractReturnMethod(String str) {
        System.out.println("Output: " + str);
        return 0;
    }
}
