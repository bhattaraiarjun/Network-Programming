import java.net.*;

public class SocketinfoRL {
    public static void main(String[] args) {
        try{
            Socket toSocket = new Socket("wwww.examole.com",80);
            System.out.println("Connected to"+toSocket.getInetAddress()+
            "on Port"+toSocket.getPort()+
            "from port"+toSocket.getLocalPort()+"of"+
            toSocket.getLocalAddress());

            toSocket.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
        
    }
    
}
