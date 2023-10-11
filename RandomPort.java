import java.net.ServerSocket;

public class RandomPort {
    public static void main(String[] args) {
        try{
            //if you pass 0 constructor on a server socket it listen on unspecified port.
            ServerSocket srv = new ServerSocket(0);
            System.out.println("This server runs on port" + srv.getLocalPort() );
            srv.close();

        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
