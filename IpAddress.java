import java.net.InetAddress;

public class IpAddress { // created the ip class
public static void main(String[] args)throws Exception {
 InetAddress addr=InetAddress.getLocalHost();  
System.out.println(addr);
}
    
}
