package Packages.Access.B;

import Packages.Access.A.Access;

public class BInheriting extends Access {
    public void method(){
        protectedField = 150;
        protectedMethod();
    }
}
