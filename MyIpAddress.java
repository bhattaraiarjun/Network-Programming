import java.net.*;

public class MyIpAddress {
    public static void main(String[] args) {
        
        try{
InetAddress my = InetAddress.getLocalHost();
String dottedQuad = my.getHostAddress();
System.out.println("My address is:"+ dottedQuad);

        }
        catch(Exception e){

            System.out.println("Error getting the ip address:"+e);

        }
    }
    
}
