import java.lang.Exception;
public class NullPointerE {
    public static void main(String[] args) {
        String str= null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException n)
        {
            System.out.println("Null can't be casted: ");
        }
        
    }
}
