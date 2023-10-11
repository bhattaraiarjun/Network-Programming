import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class BlockCookies implements CookiePolicy {

    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        if (uri.getAuthority().toLowerCase().endsWith(".gov") && cookie.getDomain().toLowerCase().endsWith(".gov")) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        CookieHandler.setDefault(new CookieManager(null, new NoGovCookies()));

        // Further code for your application...
    }
}
 
