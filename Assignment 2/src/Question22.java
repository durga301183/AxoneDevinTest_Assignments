public class Question22 {
//lowest
   /**

    public static void main(String[] args) {
        int[] intArray = {569,846,234,98,23,0,643,988};
        int least = intArray[0];
        for(int i =1;i<= intArray.length -1;i++) {
            if(intArray[i] < least) {
                least = intArray[i];
            }
        }
        System.out.println(least);
    }

}
*/

//highest
//public class Question22 {
    public static void main(String[] args) {
        int[] intArray = {569,846,234,98,23,0,643,988};
        int highest = intArray[0];
        for(int i =1;i<= intArray.length -1;i++) {
            if(intArray[i] > highest) {
                highest = intArray[i];
            }
        }
        System.out.println(highest);
    }

}









