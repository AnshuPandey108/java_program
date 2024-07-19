import java.util.Scanner;
class SimpleIf
{
   public static void main(String []args)
  {

   int age;
   System.out.println("Enter your age...");
   Scanner obj=new Scanner(System.in);
   age=obj.nextInt();
  if(age>=18)
{
    System.out.println("You can Vote! ");
}
 if(age<=18){
   System.out.println("You can't Vote!,Try after "+(18-age)+" year");
}
}
}