import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class question17 {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double addBalance(question17 Question17) {
        ///  System.out.println(this.getBalance());
        //   System.out.println(Question17.getBalance());

        double sum = this.getBalance() + Question17.getBalance();
          return sum;

    }


    public static void main(String[] args) {

        question17 o1 = new question17();

        o1.setBalance(1000.50);

        question17 o2 = new question17();

        o2.setBalance(2000.00);
       System.out.println(o1.addBalance(o2));
       // System.out.println(o1.getBalance());


    }


}






