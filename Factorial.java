import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int n,fact=1;
    System.out.println("Entre Number:");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of "+n+" is "+fact);

  }  
}
