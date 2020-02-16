public class Question25 {

    public static void main(String[] args) {
            System.out.println(generateRandomNumber());
            System.out.println(generateRandomNumber());
            System.out.println(generateRandomNumber());
            System.out.println(generateRandomNumber());
            System.out.println(generateRandomNumber());
            System.out.println(generateRandomNumber());
        }

        private static int generateRandomNumber()

        {
            return (int) (Math.random() * 100 + 1);
        }

    }
