import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
public class SenderProgram {
public static void main(String[] args)throws Exception {
DatagramChannel channel = DatagramChannel.open(); 
String message = "Hello, Receiver!"; 
ByteBuffer buffer = ByteBuffer.wrap(message.getBytes()); 
InetSocketAddress receiverAddress = new InetSocketAddress("localhost", 1234); 
channel.send(buffer, receiverAddress); 
System.out.println("Message sent successfully.");

}

}