import java.io.IOException;
import java.net.*;
public class SocketInfo {
    public static void main(String[] args) throws IOException {
        String host = "www.google.com";
        try{

            try (Socket soc = new Socket(host,80)) {
                System.out.println("Connected to "+ soc.getInetAddress()
                +"on Port"+soc.getPort()+"From port"+soc.getLocalPort()+"of address"+soc.getLocalAddress());
            }

        }catch(UnknownHostException e){
            System.err.println("\n Can't find"+host);
            
        }
        
    }
    
}
