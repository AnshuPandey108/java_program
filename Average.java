import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a,b,c,d,e,Avg,sum;
        System.out.println("Enter marks of five Subject: ");
        Scanner r= new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();
        sum=a+b+c+d+e;
        Avg=sum/5;
        System.out.println("Total marks is:"+sum);
        System.out.println("Average is:"+Avg);

    }
    
}
