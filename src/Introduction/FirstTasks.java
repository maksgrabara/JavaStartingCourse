package Introduction;

public class FirstTasks {
    public static void main(String[] args){

        double height = 1.84;
        int age = 19, weight = 69;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);

        double BMI = weight / (height * height);

        System.out.println("BMI: " + BMI);

        int BMIi = (int) BMI;

        System.out.println("BMI as integer: " + BMIi);

        int random = 99, a = 2, b = 3, c = 11;

        System.out.println("Remains from dividing by 2, 3 and 11 in order: " + (random % a) + " " + (random % b) + " " + (random % c));

        int tooMuch = 1500000000;
        System.out.println((tooMuch + tooMuch));
    }
}
