package Packages.Access.B;

import Packages.Access.A.Access;

public class B {
    public void method(){
        Access object = new Access();
        object.publicField = 10;
        object.publicMethod();
    }
}
