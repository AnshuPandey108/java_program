import java.util.Scanner;
public class Odd {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter range: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i=i+2)
        {
            
                System.out.println(i);
            
        }
    }
}
