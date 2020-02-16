package question13;

public class PostalAddressTest {

    public static void main(String[] args) {

        PostalAddress p1 = new PostalAddress("13 gordon place", "London", "W2 6AB");

        System.out.println(p1.getAddress("W2 6AB"));
        System.out.println(p1.getAddress("W2 6AZ"));

        System.out.println(p1.getDeliveryInfo());


    }
}
