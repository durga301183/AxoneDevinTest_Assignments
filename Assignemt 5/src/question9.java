public class question9 {

    static String alter(String str) {
        str.concat(" altered");
        return str.concat("altered");
       // return str;
    }
    /*

    Main method calling a function called alter taking a string and calling the concat method which returns str.
    String is immutable , it wil create a new string when calling concat which is not doing here.

     */
    public static void main(String[] args) {
        System.out.println(alter("STRING"));



      //  String str = "Java is fun";

     //   System.out.println(str.toUpperCase());
    }

}











