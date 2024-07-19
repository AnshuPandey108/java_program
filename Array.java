import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int size,i;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=r.nextInt();
        int a[] =new int[size];
        System.out.println("Enter Elements:");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Printed Array elements: ");
        for(i=0;i<size;i++)
    {
        System.out.print(a[i]+" ");
    }
    }
    
}
