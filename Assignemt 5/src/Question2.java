public class Question2 {

        public static void understandErrors() {

            //int s = "sri";
            float f;
            int i =10;
            f =i; // assigning int to a float (automatic type conversion happens)

            //i=f; // assigning float to int - semantic error flagged by compiler.


            Integer a = new Integer(10);
            Integer b = new Integer(10);
            if (a == b) {
                // objects are referenced but not values it will reference th ememory address but compiler didnt
               // show the error, so need not show semantic errors
                // semantic error not flagged by compiler "== comparator works only for primitive types"
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }

            int m = 10;
            int n = 10;
            if (m == n) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }

        }

        public static void main(String[] args) {
            understandErrors();
        }

    }




















