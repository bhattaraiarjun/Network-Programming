import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//Datagram Socket

public class SendData {
    public static void main(String[] args) {
        try{
                    DatagramSocket dgs = new DatagramSocket();
                    String str = "HELD This is Dtagram packets";

                    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), 
                    InetAddress.getByName("127.0.0.1"), 1234);

                    dgs.send(dp);
                    dgs.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
