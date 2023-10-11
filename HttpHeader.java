import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class HttpHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println("Request Method: " + connection.getRequestMethod());
            System.out.println("Response Code: " + connection.getResponseCode());
            System.out.println("Response Message: " + connection.getResponseMessage());
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date: " + new Date(connection.getDate()));
            System.out.println("Last Modified: " + new Date(connection.getLastModified()));
            long expiration = connection.getExpiration();
            if (expiration == 0) {
                System.out.println("Expiration: not specified");
            } else {
                System.out.println("Expiration: " + new Date(expiration));
            }
            System.out.println("Additional headers:");
            for (int i = 1;; i++) {
                String headerName = connection.getHeaderFieldKey(i);
                String headerValue = connection.getHeaderField(i);

                if (headerName == null && headerValue == null) {
                    break;
                }
                System.out.println(headerName + ": " + headerValue);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
