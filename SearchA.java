import java.util.Scanner;

public class SearchA {
    public static void main(String[] args) {
        int a[]=new int[5];int n,count=0;
        System.out.println("Enter Arrays all elements:");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<5;i++)
        {
           System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter Search Element: ");
        n=r.nextInt();
        for(int i=0;i<5;i++)
        {
           if(n==a[i])
           {
            System.out.println("Position at found "+n+" is "+i);
            count++;
           }
        }
        if(count<1)
        {
            System.out.println("Item not Found");
        }
        

    }
}
