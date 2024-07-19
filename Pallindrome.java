import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        int n,a,c,s=0;
        System.out.println("Enter a number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while (n>0) {
            a=n%10;
            s=(s*10)+a;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("Number is pallindrome");
        }
        else {
            System.out.println("Number is Not pallindrome");
        }
    }
}
