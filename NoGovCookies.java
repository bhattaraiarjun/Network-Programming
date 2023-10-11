
import java.net.*;

public class NoGovCookies implements CookiePolicy{

    public boolean shouldAccept(URI uri,HttpCookie cookie){
        if (uri.getAuthority().endsWith(".gov")&& cookie.getDomain().endsWith(".gov")){
            return false;

        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        new NoGovCookies();
    }
}
