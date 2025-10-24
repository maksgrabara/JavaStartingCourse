package Classes.SimpleType;

public class SimpleType {
    public static void main(String[] args) {

        int simpleType = 100;

        SimpleTypeClass output1 = new SimpleTypeClass();
        SimpleTypeClass output2 = new SimpleTypeClass();

        output1.field = 5;
        output2.field = 10;

        System.out.println("Example 1: " + output1.field);
        System.out.println("Example 2: " + output2.field);
        System.out.println("Simple type " + simpleType);
        System.out.println("Object adress (hashcode): " + output1);
    }
}
