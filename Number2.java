public class Number2 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print(i);
            }
            System.out.print("\n");
        }
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print(i);
            }
            System.out.print("\n");
        }
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                 System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                 System.out.print(i);
            }

            System.out.print("\n");
        }
        for ( i = 5; i >= 1; i--) {
            for ( j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for ( k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        
    }
}