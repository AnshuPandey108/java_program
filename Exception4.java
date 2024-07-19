public class Exception4 {
    public static void main(String[] args) {
        try
        {
           int a=20,b=0,c;
           c=a/b;
           System.out.println(c);
        }
        catch(ArithmeticException a)
        {
           System.out.println("Can't divide by zero: ");
        }
        try
        {
           int a[]={10,20,30,40};
           System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
          System.out.println("Beyond the array Limit: ");
        }
    }
}
