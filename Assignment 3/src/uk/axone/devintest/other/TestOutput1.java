package uk.axone.devintest.other;

public class TestOutput1 {

    public TestOutput1(int num) {
            this.printNumber(num);
        }

        public void printNumber(int num) {
            System.out.print(num);
        }

        public static void main(String[] args) {

            new TestOutput1(100).printNumber(100);

        }

    }










