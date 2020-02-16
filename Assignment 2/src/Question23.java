public class Question23 {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(6));

    }

    private static boolean isOdd(int i) {
        if(i % 2 != 0) {
            return true;
        }
         else return false;

    }

}