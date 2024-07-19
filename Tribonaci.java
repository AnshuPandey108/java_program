import java.util.Scanner;

public class Tribonaci {
    public static void main(String[] args) {
        int a=0,b=1,c=2,d,term;
        Scanner r=new Scanner(System.in);
        System.out.println("Enete Term: ");
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
           System.out.print(a+" ");
           d=a+b+c;
           a=b;
           b=c;
           c=d;
        }
    }
}
