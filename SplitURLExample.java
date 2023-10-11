/* parsing the URL*/
/*WAP  to parse the given url https://www.example.com:443/anything/thispage.html?param1= value1#here*/
import java.net.*;

public class SplitURLExample {
    public static void main(String[] args) {
        try{
        String urlString ="https://www.example.com:443/anything/thispage.html?param1= value1#here";
        URL url = new URL(urlString);
            System.out.println("Protocol:"+url.getProtocol()); // retrive protocol
            System.out.println("Port no:"+url.getPort()); // retrive port number
            System.out.println("Authority:"+url.getAuthority()); // retrive hostname,username and port
            System.out.println("Query:"+url.getQuery());// retrive query string if no then return null
            System.out.println("Userinfo:"+url.getUserInfo());// retrive hostname if no return null
            System.out.println("Path:"+url.getPath()); // retrive the file path from url
            System.out.println("File:"+url.getFile()); // retrive the file path form url
            System.out.println("Hostname:"+url.getHost()); // retrive host name
            System.out.println("Fragment Identifier:"+url.getRef()); //retrive fragment Identifires
         
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}