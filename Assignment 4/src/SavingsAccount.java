public class SavingsAccount extends Account {

    public boolean doubleYourSavings(Account account)
    {
        if (account.getBalance() >= this.getBalance())
        {                 // 1000>=500
            account.setBalance(account.getBalance() - this.getBalance()); // moving the money

// account.setBalance(1000-500);

            this.setBalance(this.getBalance() * 2);

// this.setBalance(500 * 2);
            return true;
        } else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        SavingsAccount sacc1 = new SavingsAccount();
        sacc1.setBalance(500);

        Account acc1 = new Account();
        acc1.setBalance(1000);

        boolean isMoneyMoved = sacc1.doubleYourSavings(acc1);//1000 ie true

        System.out.println("is Money Moved :"+isMoneyMoved);

        System.out.println("Savings account has "+sacc1.getBalance());//1000

        System.out.println("Account has "+acc1.getBalance());//500

        SavingsAccount sacc2 = new SavingsAccount();
        sacc2.setBalance(500);

        Account acc2 = new SavingsAccount();

        //SavingsAccount sa = new Account();

        acc2.setBalance(100);//account class    100>=500? false

        boolean isMoneyMoved2 = sacc2.doubleYourSavings(acc2);
        System.out.println("is Money Moved :"+isMoneyMoved2);

        System.out.println("Savings account has "+sacc2.getBalance());
        System.out.println("Account has "+acc2.getBalance());

    }


}
