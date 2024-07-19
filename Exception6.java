public class Exception6 {
    public static void main(String[] args) {
        try
        {
            try
            {
              int a[]={10,20,30};
              System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
              System.out.println(a);
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException b)
        {
            System.out.println(b);
        }
        System.out.println("Anshu Pandey: ");
    }
}
