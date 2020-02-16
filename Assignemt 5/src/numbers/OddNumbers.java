package numbers;

import numbers.Numbers;

public class OddNumbers extends Numbers {

    public OddNumbers(int num) {

        super(num);
    }

    public void print() {

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }


        }
    }
}