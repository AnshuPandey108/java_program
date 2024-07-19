import java.util.Scanner;
class elseIf
{
    public static void main(String []args)
{
      int marks;
      System.out.println("Enter marks: ");
      Scanner ref=new Scanner(System.in);
      marks=ref.nextInt();
      if(marks>80)
      {
       System.out.println("Topper ");
      }
      else if(marks<80 && marks>=60)
      {
      System.out.println("First ");
      }
      else
      {
        System.out.println("Second ");
      }
}
}