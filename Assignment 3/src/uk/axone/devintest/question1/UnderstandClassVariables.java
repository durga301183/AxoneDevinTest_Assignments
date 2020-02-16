package uk.axone.devintest.question1;

public class UnderstandClassVariables {

    private final String s1 = "Sridevi"; // instance variable

    private static String s2 = "Sridevi"; //class variable

    public static void main(String[] args) {

        // global variables (global - can be accessed by any methods within a class)
        s2 = "Punitha";


        // local variables (local to methods) - scope is the method which is declaring it.


        //Keywords
        //1. static - method & variables  - static method, static variables (class variable)
        //2. final - the value once assigned cannot be changed.

       // UnderstandClassVariables v1 = new UnderstandClassVariables();

       // v1.s1();// not possible as s1 is accessedd from priate methods
        UnderstandClassVariables v2 = new UnderstandClassVariables();
                v2.s2();

       // System.out.println(v1.s1);
        //v1.s2 = "Pavithra"; cannot change as its final
        //System.out.println(v2.s2);

//s2 will not give  output as sriddvi as the access is private and can be accessed through private method
        //System.out.println(s2);
//

    }
    private void s2() {
        System.out.println(s2);
    }
    }

