import java.util.Scanner;

public class Digitsum {
public static void main(String[] args) {
    int n,a,sum=0;
    System.out.println("Enter a number");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    while (n>0) {
          a=n%10;
          sum=a+sum;
          n=n/10;
    }
    System.out.println("Sum of digit id: "+sum);
}
}
