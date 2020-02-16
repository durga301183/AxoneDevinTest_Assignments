package uk.axone.devintest.other;

public class question10 {

//no argument constructor and meprivate , dead code
    private question10(){

        System.out.println("constructor");
    }
}
/*A class with just a private constructor is not much of a use.
        This piece of code will not throw any compilation errors but is not usable.

        1. If it had a main method and if that was creating the object of the class it would have some meaning.
        2. Or another public parameterized constructor would make sense so that a subclass of this class would be able to call the public constructor of the superclass.
        3. Or instead of private if it was protected or public it would make some sense.

        */
