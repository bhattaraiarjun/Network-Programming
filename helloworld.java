import java.net.InetAddress;
public class helloworld {
public static void main(String[] args) {
try {
InetAddress obj1 = InetAddress.getByName("www.ibilio.org"); 
InetAddress obj2 = InetAddress.getByName("hello.ibilio.org");
boolean x = obj1.equals(obj2); 
System.out.print("Both hostnames are equal:" +x); 
}
catch(Exception e ){
    System.out.println(e);
}
}
}