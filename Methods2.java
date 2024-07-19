import java.util.Scanner;

public class Methods2 {
    int n1,n2,add,sub,mul,div,rem;
    public static void main(String[] args) {
       Methods2 r=new Methods2();
       r.input();
       r.process();
       r.output(); 
    }
    void input()
    {
      System.out.println("Enter two numbers: ");
      Scanner r=new Scanner(System.in);
      n1=r.nextInt();
      n2=r.nextInt();
    }
    void process()
    {
       add=n1+n2;
       sub=n1-n2;
       mul=n1*n2;
       div=n1/n2;
       rem=n1%n2;
    }
    void output()
    {
      System.out.println("Addition: "+add);
      System.out.println("Subtraction: "+sub);
      System.out.println("Multiplication: "+mul);
      System.out.println("Division: "+div);
      System.out.println("Remainder: "+rem);
    }
}
