public class Exception3 {
    public static void main(String[] args) {
        try
        {
          System.out.println("Anshu Pandey: ");
          int a=20,b=0,c;
          c=a/b;
          System.out.println(c);
          System.out.println("Perfect Pandey: ");
        }
        catch(ArithmeticException a)
        {
           
            System.out.println("Can't devided by zero: ");
        }
        finally
        {
            
           System.out.println("Dangeer Pandey: ");
        }
        System.out.println("Main method ended: ");
    }
    
}
