import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Array Element:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.println("\nMatrix: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
