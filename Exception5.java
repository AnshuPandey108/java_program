import java.lang.Exception;
public class Exception5 {
    public static void main(String[] args) {
        try
        {
          int a=10,b=0,c;
          c=a/b;
          System.out.println(c);

          int arr[]={10,20,30};
          System.out.println(arr[5]);

          String str="Anshu";
          System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
           System.out.println("Array Exception: ");
        }
        catch(ArithmeticException b)
        {
           System.out.println("Arithmatic Exception");
        }
        catch(NumberFormatException c)
        {
            System.out.println("Number Exception: ");
        }
        catch(Exception e)
        {
            System.out.println("All type exception handled: ");
        }
    }
}
