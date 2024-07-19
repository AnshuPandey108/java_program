import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
    int n1,n2,ch;
    System.out.println("Enter Two Number:");
    Scanner r=new Scanner(System.in);
    n1=r.nextInt();
    n2=r.nextInt();
    ch=r.nextInt();
     if (ch==1) {
        System.out.println("Addition: "+(n1+n2));
     }
     else if (ch==2) {
        System.out.println("Subtraction: "+(n1-n2));
     }
     else if (ch==3) {
        System.out.println("Multiplictaopn: "+(n1*n2));
     }
     else if (ch==4) {
        System.out.println("Division: "+(n1/n2));
     }
     else {
        System.out.println("Remainder: "+(n1%n2));
     }
    }
}