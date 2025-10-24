package Classes.String;

public class StringTasks {
    public static void main(String[] args){

        String name = "Maksymilian", surname = "Grabara", fullName = "Maksymilian Grabara";

        System.out.println("Lengths: " + name.length() + " " + surname.length() + " " + fullName.length());

        if(name.equals("Alicja") || name.equals("Jan")) System.out.println("Equals");
        else System.out.println("Equals not");

        System.out.println("Surname: " + surname.toUpperCase());

        System.out.println("Replaced surname: " + surname.replace('a', 'e'));

        String sentence = "I'm somewhat skilled in programming now";

        for(int i = 0; i < sentence.length(); i++){
            System.out.println(sentence.charAt(i));
        }

        String sentenceReverse = "I'm getting better and better every day!";

        for(int i = sentenceReverse.length() - 1; i >= 0; i--){

            System.out.println(sentenceReverse.charAt(i));
        }
    }
}
