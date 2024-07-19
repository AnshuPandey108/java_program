import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        System.out.println("Enter Term: ");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
          System.out.print(a+" ");
          c=a+b;
          a=b;
          b=c;

        }
    }
}
