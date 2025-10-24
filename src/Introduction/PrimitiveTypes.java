package Introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // Integers
        byte variableByte = 10;
        System.out.println("Variable byte: " + variableByte);
        System.out.println("Byte MIN and MAX values: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short variableShort = 200;
        System.out.println("Variable short: " + variableShort);
        System.out.println("Short MIN and MAX values: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int variableInt = 1000000;
        System.out.println("Variable int: " + variableInt);
        System.out.println("Int MIN and MAX values: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long variableLong = 1000000000000L;
        System.out.println("Variable long; " + variableLong);
        System.out.println("Long MIN and MAX values: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Floating point numbers

        float variableFloat = 12.342323232323F; //32 bits(4 bytes)
        System.out.println("Variable float; " + variableFloat);
        System.out.println("Float MIN and MAX values: " + Float.MIN_VALUE + " " + Float.MAX_VALUE);

        double variableDouble = 12.3423232323; //64 bits(8 bytes) - more precision
        System.out.println("Variable double; " + variableDouble);
        System.out.println("Double MIN and MAX values: " + Double.MIN_VALUE + " " + Double.MAX_VALUE);

        // Single characters

        char variableChar = 'a';
        System.out.println("Variable char: " + variableChar);

        // Logic

        boolean variableBoolean = false;
        System.out.println("Variable boolean: " + variableBoolean);
    }
}
