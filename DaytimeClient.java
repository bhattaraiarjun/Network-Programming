import java.net.*; 
import java.io.*; 
public class DaytimeClient {
public static void main(String[] args) { 
try { 
try (Socket socket = new Socket("time.nist.gov", 13)) {
    socket.setSoTimeout(15000); 
    InputStream in = socket.getInputStream(); 
    StringBuilder time = new StringBuilder(); 
    InputStreamReader reader = new InputStreamReader(in, "ASCII"); 
    for (int c = reader.read(); c != -1; c = reader.read()) { 
    time.append((char) c); 
    }
    System.out.println(time);
} 
} catch (IOException ex) { 
System.err.println(ex); 
}
}
}