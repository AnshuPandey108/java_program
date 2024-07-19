import java.util.Arrays;
import java.util.Scanner;

public class CopyofA {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter Arrays all elements:");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
        int[] a2 = Arrays.copyOf(a, 5);
        System.out.print("\nCopied Element: ");
        for(int i:a2)
        {
            System.out.print(i+" ");
        }
    }
}
