
import java.util.Scanner;
public class Addition {
    
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Addition of two numbers is: "+(a+b));
    }
}
