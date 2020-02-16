package uk.axone.devintest.question1;

public class Robot {

    public final int numberFunctions=7; // instance variable
    private static String latestModel = "ASIMO"; // class variable
    static double d=2.5; //if value is not assigned then it returns 0.0

    public static void main(String[] args) {

        /*
        c) latestModel cannot be accessed directly from an instance method in the class Robot.
FALSE, static variables can be accessed by non-static/instance methods.
-Instance methods can access instance variables and instance methods directly.
-Instance methods can access class variables and class methods directly.
-Class methods can access class variables and class methods directly.
-Class methods cannot access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as there is no instance for this to refer to.

   */

  Robot R1= new Robot();

        //latestModel cannot have different values for different instances of Robot.

      /*  The numberFuntions variable contained in an instance of Robot called robot1 can be accessed
        from an instance of Robot called robot2 provided that robot2 has a reference to robot1.TRUE
        memory will not be allocated to R2 as its sharing R1
        */

      Robot R2 = R1;//as its pointing to robot 1 , need not be initialised again
        R1.testAccess();

      //  System.out.println(R2/R2.numberFunctions);
        System.out.println(d);

//can you access non-static variable?? ,
        System.out.println(latestModel);//static variables can be accessed by non-static/instance methods.
      //  System.out.println(numberFunctions);//NO, Non-static field 'numberFunctions' cannot be referenced from a static context

    }

    //instance/non-static method of class Robot
    public void testAccess() {
         //  int i=10;
        latestModel = "DUMMY";
        System.out.println(latestModel);
    }



}
