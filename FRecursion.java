import java.util.Scanner;

public class FRecursion {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value of number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        FRecursion ref=new FRecursion();
        int result=ref.fact(n);
        System.out.println("Factorial of Given Number is: "+result);
    }
    int fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
}
