import java.lang.Exception;
public class Exception8 {
    public static void main(String[] args) {
        try
        {
          String a="anshu";
          System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
        finally
        {
            try
            {
              System.out.println(10/0);
            }
            catch(ArithmeticException b)
            {
               System.out.println(b);
            }
            finally
            {
               System.out.println("Anshu Pandey");
            }
        }
        System.out.println("Main method ended: ");
    }
}
