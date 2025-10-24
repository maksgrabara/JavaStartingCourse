package Classes.Constructors;

public class ConstructorsClass {

    int first;
    int second;

    ConstructorsClass(int valueFirst){
        System.out.println("Same constructor but with 1 parameter");
        first = valueFirst;

    }

    ConstructorsClass(int valueFirst, int valueSecond){
        first = valueFirst;
        second = valueSecond;
    }
}
