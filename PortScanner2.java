import java.net.Socket;

public class PortScanner2 {
    public static void main(String[] args) {
        String host = "localhost";
        for (int port = 1; port <= 1024; port++) {
            try {
                Socket s = new Socket(host, port);

                System.out.println("Port " + port + " is open");
                s.close();
            } catch (Exception ex) {
            }
        }
    }

}
