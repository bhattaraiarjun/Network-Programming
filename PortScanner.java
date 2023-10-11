import java.io.IOException;
import java.net.*;
//import java.io.*;
public class PortScanner {
    public static void main(String[] args) {
        String host = "Localhost";
        for(int port= 1024; port<1055;port++){

            try{
                ServerSocket server =  new ServerSocket(port);

                System.out.println("There is a server on port"+ port+ " "+ "of" +" "+host);
                server.close();
            }
            catch(IOException e){

             System.out.println(e); 

                     }
        }
    }
}
    