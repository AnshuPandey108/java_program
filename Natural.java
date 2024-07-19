import java.util.Scanner;
public class Natural {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number of terms: ");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        

        for(int i=1;i<=n;i++)
        {
            System.out.println("Numbers are "+i);
        }
    }
    
}
