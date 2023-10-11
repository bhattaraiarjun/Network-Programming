import java.net.DatagramPacket;
import java.net.DatagramSocket;

//Datagram socket

public class ReceiveData {
    public static void main(String[] args) {
        try {
            DatagramSocket dgs = new DatagramSocket(1234);
            byte[] buffer = new byte[1024];

            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

            dgs.receive(dp);

            String receivedData = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Received data: " + receivedData);

            dgs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
