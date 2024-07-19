import java.util.Scanner;

/**
 * InsertA
 */
public class InsertA {

    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Size of array");
        size=r.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter Elements of array: ");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter Array Location: ");
        loc=r.nextInt();
        System.out.print("\nEnter new Item: ");
        item=r.nextInt();
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}