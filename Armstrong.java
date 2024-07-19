import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,a,c,arm=0;
        System.out.println("Enter a number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while (n>0) {
            a=n%10;
            arm=(a*a*a)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
    
}
