import java.net.URLConnection;

public class GuessContentType {

    GuessContentType(){

        String fileName = "http:example.com/example.pdf";
        String contentType = URLConnection.guessContentTypeFromName(fileName);
        System.out.println("Content Type: "+contentType);
    }
    public static void main(String[] args) {
        new GuessContentType();
    }
    
}
 