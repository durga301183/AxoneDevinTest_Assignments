package uk.axone.devintest.other;

public class TestOutput {


       int number = 20;

        public TestOutput(int number) {
            this.number = number;
          // there is no way to know which number you are pointing to. Use this keyword.
        }

        public void printNumber() {
            System.out.println(number);
        }

        public static void main(String[] args) {

            TestOutput to = new TestOutput(32);
            to.printNumber();
        }

    }


