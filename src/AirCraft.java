import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AirCraft {

     AirCraft(String str){
         System.out.println(str);
     }

     public void  takeOff(){
       System.out.println(" aircraft is taking off");
     }

 String landing( int i) {
         return ("aircraft is landing");
     }


    public static void main(String[] args) {

        AirCraft A380 = new AirCraft("durga");

        String str = A380.landing(0);
        System.out.println(str);

        A380.takeOff();
    }

}
