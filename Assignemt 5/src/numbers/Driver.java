package numbers;

public class Driver {

    public static void main(String[] args) {

        Numbers n = new Numbers(50);

        EvenNumbers eve = new EvenNumbers(50);

        OddNumbers odd = new OddNumbers(50);

        n.print();
        System.out.println("_____________________NUMBERS____________________________");
        eve.print();
        System.out.println("_____________________ODD________________________________");
        odd.print();
        System.out.println("_____________________EVEN_______________________________");
    }



    }





