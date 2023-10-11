import java.net.*;
public class URLEquality {

    public static void main(String[] args) {

        try{

            URL exm1=new URL("https://www.example.com");//creating url object
            URL exm2=new URL("https://example.com");//creating url2 object
            
            if(exm1.equals(exm2)){
                System.out.println(exm1+ " is same as" +exm2);//output if TRUE

            }
            else{

                System.out.println(exm1+ " is not same as" +exm2);//output if FALSE
            }
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        
    }
}