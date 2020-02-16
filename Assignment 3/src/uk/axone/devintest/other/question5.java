package uk.axone.devintest.other;

public class question5 {


    int x= 10;

    public static void main(String[] args) {
        question5 to = new question5();
        System.out.println(to.x);

    }
//static block, static keyword with body
    //static is class level so it executes first
    static {
        int x = 20;
        System.out.print(x + " ");
    }

}
