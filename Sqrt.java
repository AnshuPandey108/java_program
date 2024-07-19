import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any Number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        double m=Math.sqrt(n);
        System.out.println("Square root of "+n+" is "+m);
    }
}
