package Classes.InnerClass;

public class OutterClass {
    int field;

    int outterMethod(){
        InnerClass objectOutter = new InnerClass();
        objectOutter.innerField = 200;
        return -1;
    }


    class InnerClass {
        int innerField;

        int innerMethod(){
            outterMethod();
            field = 150;
            return -2;
        }
    }
}
