package Classes.AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {

        OtherClass object1 = new OtherClass() {
            @Override
            public void SomeMethod() {
                System.out.println("Anonymous class");
            }
        };

        object1.SomeMethod();

        OtherClass object2 = new OtherClass();
        MethodHere(new Button(){
            @Override
            public void onClick() {
                System.out.println("Button pressed nad showed results");
            }
        });
    }

    public static void MethodHere(Button parameter){
        parameter.onClick();
    }

    static class Button{
        public void onClick(){
            System.out.println("Button pressed");
        }
    }
}
