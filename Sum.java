import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.print("Enter the term: ");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first n natural numbers is "+sum);
    }
}
