import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,a;
        System.out.println("Enter Number: ");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        while (n>0) {
            a=n%10;
            System.out.print(a);
            n=n/10;
        }
    }
    
}
