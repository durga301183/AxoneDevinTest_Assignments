package com.airbus.craft;

public class Aircraft {
     //constructor with same name as class and o return type with passing string argument
    //constructor called by invoking the method and passing a string variable
      Aircraft(String s)
      {
          System.out.println(s);
      }
      //creating a method takeoff which does not return any value  and printing the output

    void takeOff(){
            System.out.println("Aircraft is taking off");
      }

    //creating a method landing which returns a value of integer data type  and storing in variable i
        String landing(int i)

        {
        return "Aircraft landing";
        }
        public static void main(String[] args) {
          /**
             * Creating an instance for the class AirCraft with variable A380 and calling the methods from main method
             * Invoking default constructor
             * storing the return value of i from landing method under subvalue
             */
          Aircraft A380 = new Aircraft("durga");
            A380.takeOff();
            String subvalue = A380.landing(0);
             System.out.println(subvalue);
        }
    }

















