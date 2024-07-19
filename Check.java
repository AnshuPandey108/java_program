import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n>0)
        {
            System.out.println("Number is +ve");
        }
        else if (n<0) {
            System.out.println("Number is -ve");
        }
        else {
            System.out.println("Neither +ve nor -ve");
        }
    }
}
