 import java.util.Scanner;
class IfElse
{
    public static void main(String []args)
{
   int n;
   System.out.println("Enter any number");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   if(n>=0)
  {
   System.out.println("+ve Number ");
  }
  else
{
   System.out.println("-ve Number ");  
}
}
}