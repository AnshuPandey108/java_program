import java.util.Arrays;
import java.util.Scanner;

public class SortA {
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
        
        Arrays.sort(a);
        System.out.println("\nSorted Array are: ");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
}
