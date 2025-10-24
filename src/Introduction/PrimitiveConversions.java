package Introduction;

public class PrimitiveConversions {
    public static void main(String[] args){

        int i = 6;
        double d = 2.2;
        System.out.println(i/d);

        byte by = 100;
        i = by; //Ok
        int i2 = 500;
//        by = i2; byte is too small

        float f = 123.22f;
//        double d = f; wrong types
        double d2 = (double) f; //cast float to double

        long l = 123;
        i2 = 0;

        l = i2; //Implicit conversion (cast not needed)
        i2 = (int) l; //Cast needed

        long l2 = 1234; //default conversion to int
        //long l3 = 123456789123; too big for int
        long l4 = 123456789123L;

        int i3 = 10245;
        byte by2 = (byte) i3;
        System.out.println("Cast larger int to byte: " + by2);

        double inputDouble1 = 1.2;
        double inputDouble2 = 12.4;
        double outputDouble = inputDouble2 / inputDouble1;
        System.out.println("Output double: " + outputDouble);

        int outputInt = (int) inputDouble2 / (int) inputDouble1;
        System.out.println("Output int: " + outputInt); //doubles floored, then divided

        int outputInt2 = (int) (inputDouble2 / inputDouble1); //different order of procedures
        System.out.println("Output int: " + outputInt2);

        char c = 'a';
        int charConversion = c; //ASCII code
        System.out.println("Char to int conversion: " + charConversion);
    }
}
