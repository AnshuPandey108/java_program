import java.util.Arrays;
import java.util.Scanner;

public class EqualsA {
    public static void main(String[] args) {
         int a[]=new int[5];
         int a2[]=new int[5];
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
        System.out.println("\nEnter Data in Array2:");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=r.nextInt();
        }
        boolean b=Arrays.equals(a, a2);
        System.out.print("Is two array are equal?: "+b);
        
    }
}
