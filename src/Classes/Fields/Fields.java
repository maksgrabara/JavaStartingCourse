package Classes.Fields;

public class Fields {
    public static void main(String[] args) {

        FieldsClass field = new FieldsClass();
        field.number = 15;
        System.out.println(field.number);

        field.setValue(20);
        field.returnValue();
        int variable = field.returnValueInt();
        System.out.println("Number as int: " + variable);
    }
}
