import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlConnection = url.openConnection();
            System.out.println("URL: " + urlConnection.getURL());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
