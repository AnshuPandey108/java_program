import java.util.Scanner;
class Switch
{
   public static void main(String []args)
{
  int a=10,b=20,ch;
  System.out.print("Enter User Choice..!\n"); 
  Scanner r=new Scanner(System.in);
  ch=r.nextInt();
  switch(ch)
  {
  case 1:
  System.out.print("Sum "+(a+b)); 
  break;
  case 2:
  System.out.print("Sub  "+(a-b)); 
  break;
  case 3:
  System.out.print("Multi "+(a*b)); 
  break;
  case 4:
  System.out.print("Div "+(a/b)); 
  break;
  default:
  System.out.print("Invalid Choice!"); 
  }
}
}