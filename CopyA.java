import java.util.Scanner;

public class CopyA {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter value of first Array");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.err.print("First Array element: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nSecond Array element: ");
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
