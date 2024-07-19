import java.util.Scanner;

public class AddAe {
    public static void main(String[] args) {
        int a[]=new int[5]; int sum=0;
        System.out.println("Enter Array Elements: ");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
           a[i]=r.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i=0;i<5;i++)
        {
           System.out.print(a[i]);
           sum=a[i]+sum;
        }
        System.out.println("\nSum of array elments: "+sum);
    }
}
