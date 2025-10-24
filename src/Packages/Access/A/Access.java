package Packages.Access.A;

public class Access {

    public int publicField;     //accessible everywhere
    protected int protectedField;       //accessible while inheriting and in the same package
    private int privateField;       //accessible only in the same class
    int casualField;        //accessible in the same package

    void method(){
        privateField = 100;
    }

    public void publicMethod(){

    }

    protected void protectedMethod(){

    }

    private void privateMethod(){

    }

    void casualMethod(){

    }

}
