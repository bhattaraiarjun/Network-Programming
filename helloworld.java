
import java.net.*;

class Hello  {

    public static void main(String[] args) {

try  {

    InetAddress obj = InetAddress.getByName("www.google.com");
        
    System.out.println(obj);

}
    catch(Exception e)
    {
        System.out.println(e);
    }    



        System.out.println("hello World");
    }
}