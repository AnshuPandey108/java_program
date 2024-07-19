import java.util.Scanner;

public class DesendingA {
     public static void main(String[] args) {
         int a[]=new int[5];int temp;
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
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
               if(a[i]<a[j])
               {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
            }

        }
        System.out.println("\nDesending order Array: ");
        for(int i=0;i<5;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
}
