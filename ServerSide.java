import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

//server side chat

public class ServerSide {
    public static void main(String[] args) {
        try{
            ServerSocket ss =new ServerSocket(8080);
            
            Socket s = ss.accept(); // wait for a client to connect to the server

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = "",str2="";
            while( !str.equals("stop")){
                System.out.println("Waiting for client reply..");
                str  = din.readUTF();
                System.out.println("Client: " + str);
                System.out.println("Enter Message:");
                
                str2 = reader.readLine(); // read a reply from the console

                dout.writeUTF(str2);  // write the reply to the output stream of the socket

                dout.flush();
            }
            din.close();
            //dout.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
