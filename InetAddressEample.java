import java.net.InetAddress;

public class InetAddressEample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.example.com");
            System.out.println(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
