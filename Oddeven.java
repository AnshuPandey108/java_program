import java.util.Scanner;
class OddEven
{
   public static void main(String[] args) {
    int n;
    System.out.println("Enter any Number");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    if(n%2==0)
    {
        System.err.println("Number is even");
    }
    else
    {
        System.err.println("Number is odd");
    }
   }  
}