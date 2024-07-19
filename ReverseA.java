import java.util.Scanner;

public class ReverseA {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Elements in array:");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.err.print("Array Elements: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.err.print("\nReverse Array: ");
        for(int i=4;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
