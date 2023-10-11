/* WAP in java that connect to a url ("http://www.example.com") and retrive data from it using 
openCommand() and getInputSteam() Method*/
import java.net.*;
import java.io.*;
 
public class URLConnectionExample  {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.example.com");
        URLConnection connection = url.openConnection();
        
        InputStream stream = connection.getInputStream();
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(stream));
        
        String line;
        
        while((line = reader.readLine())!=null){
            
            System.out.println(line); /*print each line*/
        }
        reader.close();/*close the buffered reader to release resources*/
        
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
}