import java.net.*;
class networking{

    public static void main(String[] args) throws UnknownHostException {
        InetAddress obj1= InetAddress.getByName("www.scst.edu.np");
        InetAddress obj2 = Inet4Address.getByName("www.scst.edu.np");

        boolean x= obj1.equals(obj2);
        System.out.println(x);
    }

        
    }

    
