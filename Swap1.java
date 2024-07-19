import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter value of a");
        a=r.nextInt();
        System.out.println("Enter value of b");
        b=r.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a is:"+a);
        System.out.println("value of a is:"+b);

    }
}
