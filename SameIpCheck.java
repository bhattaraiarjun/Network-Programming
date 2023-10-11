import java.net.*;

public class SameIpCheck {
    public static void main(String[] args) {
        
        try{
            InetAddress obj1 = InetAddress.getByName("www.ibilio.org");
            //get ip address & host

            InetAddress obj2 = InetAddress.getByName("helio.ibilio.org");
             System.out.println(obj1);
             System.out.println(obj2);
             System.out.println("\n");

             if (obj1.equals(obj2)){ // checking the equality
System.out.println("www.ibilio.org is same as the helio.ibilio.org");

             }
             else{
                System.out.println("They are not same");
             }
            }
             catch(Exception e){

                System.out.println("Error occured"+e);
             }

        }
    }
