//WAP to Split the given url using java url class method :
//https://www.example.com:90/anything/thispage.html?param1=value1#here */
import java.net.*;

public class URLMethods {

    public static void main(String[] args) {
        
        try{

            String UrlString = "https://admin@www.example.com:443/anything/thispage.html?param1=value1#here";

            URL Url = new URL (UrlString);

            System.out.println("Protocol: "+Url.getProtocol()); //get protocol

            System.out.println("Port no: "+Url.getDefaultPort()); //get port num

            System.out.println("Authority:"+Url.getAuthority()); //retriv host name,user name & port num

            System.out.println("Query:"+Url.getQuery()); //retrive query string if no then null.

            System.out.println("UserInfo:"+Url.getUserInfo()); //retrive user info if no then null.

            System.out.println("Path:"+Url.getPath()); // retrive file path.

            System.out.println("File"+Url.getFile()); //retrive file path along with query.

            System.out.println("HostName:"+Url.getHost()); //retrive the host name.

            System.out.println("Fragment Identifier"+Url.getRef()); // retrive fragment identifiers.

        }
        catch(MalformedURLException e){

            System.out.println(e);
        }
    }

}
