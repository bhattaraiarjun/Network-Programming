import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class ReceiverProgram {
    public static void main(String[] args)throws Exception {
    DatagramChannel channel = DatagramChannel.open();  
    InetSocketAddress receiverAddress = new InetSocketAddress("localhost", 1234); 
    channel.bind(receiverAddress);
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    channel.receive(buffer);     
    buffer.flip();
    byte[] receivedData = new byte[buffer.remaining()];
    buffer.get(receivedData);
    String message = new String(receivedData);
    System.out.println("Received message: " + message);
    }
    
    
}
