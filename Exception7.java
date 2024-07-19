import java.lang.Exception;
public class Exception7 {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
           try
           {
             String str=null;
             System.out.println(str.toUpperCase());
           }
           catch(Exception n)
           {
             System.out.println("Null value can not be converted: ");
           }
        }
        System.out.println("Main method ended: ");
    }
}
