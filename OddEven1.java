import java.util.Scanner;
public class OddEven1 {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.print("Enter Range: ");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
            for(int i=0;i<=n;i=i+2)
            {
              sum=sum+i;
            }
            System.out.println("Sum is "+sum);
        }
        else
        {
            for(int i=1;i<=n;i=i+2)
            {
              sum=sum+i;
            }
            System.out.println("Sum is "+sum);
        }
    }
}
