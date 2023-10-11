
import java.net.*;
public class HostnameCanonical {
    public static void main(String[] args) {
        
        try{
            InetAddress addr = InetAddress.getByName("9.9.9.9");
            System.out.println(addr.getHostName());
        }
        catch(Exception e){
System.out.println("Error getting Host name." +e);

        }
    }
    
}
