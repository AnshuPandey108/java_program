import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter value of a");
        a=r.nextInt();
        System.out.println("Enter value of b");
        b=r.nextInt();

        c=a;
        a=b;
        b=c;
        System.out.println("value of a is:"+a);
        System.out.println("value of a is:"+b);
    }
    
}
