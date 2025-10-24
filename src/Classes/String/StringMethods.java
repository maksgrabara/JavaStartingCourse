package Classes.String;

public class StringMethods {
    public static void main(String[] args){

        String string1 = "Hello!";
        String string2 = "     ";

        System.out.println(string1.length());
        System.out.println(string1.isEmpty());
        System.out.println(string2.isBlank());

        char singleSign = string1.charAt(3);
        System.out.println(singleSign);

        String string3 = string1.substring(3);
        System.out.println(string3);

        String string4 = string1.substring(2, 5);
        System.out.println(string4);

        String string5 = "     oapapsk    lskskk     ";
        System.out.println("Untrimmed string: " + "." + string5 + ".");
        System.out.println("Trimmed string: " + "." + string5.trim() + ".");

        String string6 = "DiFFeReNt SizeS RUlE!";
        System.out.println(string6.toLowerCase());
        System.out.println(string6.toUpperCase());

        String string7 = "Magnificent job my lord";
        System.out.println(string7.startsWith("magnificent"));
        System.out.println(string7.toLowerCase().startsWith("magnificent"));

        String string8 = "Lmao what the hell!";
        System.out.println(string8.endsWith("hell!"));

        String string9 = "I have Absolutely no idea what is going on";
        System.out.println(string9.toLowerCase().contains("absolutely"));
        System.out.println(string9.replace('a', 'g'));
    }
}
