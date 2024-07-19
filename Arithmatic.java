
import java.util.Scanner;
class Arithmatic
{
   public static void main(String []args)
  {
   int a,b;
   System.out.println("Enter two numbers...");
   Scanner obj=new Scanner(System.in);
   a=obj.nextInt();
   b=obj.nextInt();
   System.out.println("ADDITION "+(a+b));
   System.out.println("Subtraction "+(a-b));
   System.out.println("Multiplicatio "+(a*b));
   System.out.println("Division "+(a/b));
   System.out.println("Remainder "+(a%b));
  }
}