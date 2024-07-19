import java.util.Scanner;

public class SmallestA {
    public static void main(String[] args) {
        int a[]=new int[5];int min;
        System.out.println("Enter Arrays all elements:");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements:");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
        min=a[0];
        for(int j:a)
        {
            if(j<min){
              min=j;
            }
        }
        System.out.println("\nSmallest element of Array is: "+min);
    }
    
}
