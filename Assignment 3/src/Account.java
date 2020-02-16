public class Account {

    /**
     * Write a private instance method for the class Account called addBalances().
     * This method takes a single Account object as an argument and returns the total of the
     * balances of the receiver and the argument Account objects.
     */
    private double balance;
//getter and setter methods woth balance access modifier  private
    public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        //main role of this question is with 'this' keyword//here receiver is the one which invokes the class and created an object
        private double addBalances(Account account)//taking itself as an  object argument ie taking class as an argument
        {
            System.out.println(this.getBalance());
            System.out.println(account.getBalance());

            double sum = this.getBalance() + account.getBalance();
            return sum;
        }

        public static void main(String[] args) {
            Account acc1 = new Account();
            acc1.setBalance(1000.50);

            Account acc2 = new Account();
            acc2.setBalance(1200.70);

            System.out.println(acc1.addBalances(acc2));
        }

    }



