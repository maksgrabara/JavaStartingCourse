package Classes.Fields;

public class FieldsClass {

    int number;

    void returnValue(){
        System.out.println("Returned value: " + number);
    }

    void setValue(int value){
        number = value;
    }

    int returnValueInt(){
        return number;
    }
}
