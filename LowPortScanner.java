import java.io.IOException;
import java.net.*;

public class LowPortScanner {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";

        for (int port = 1; port <= 1024; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), 1000);
                socket.close();
                System.out.println("Server found on port " + port + " of " + host);
            } catch (IOException ex) {
                // No server found on this port
            }
        }
    }
}
