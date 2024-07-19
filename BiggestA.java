import java.util.Scanner;

public class BiggestA {
    public static void main(String[] args) {
        int a[]=new int[5];int max;
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
        max=a[0];
        for(int j:a)
        {
            if(max<j){
              max=j;
            }
        }
        System.out.println("\nBiggest element of Array is: "+max);
    }
    
}
