import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    
}
