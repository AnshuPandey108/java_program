public class Char1 {
    public static void main(String[] args) {
        char i,j,k;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                 System.out.print(i);
            }
            System.out.print("\n");
        }
        for(i='E';i>='A';i--)
        {
            for(j='A';j<=i;j++)
            {
                 System.out.print(i);
            }
            System.out.print("\n");
        }
        for(i='A';i<='E';i++)
        {
            for(j=i;j<'E';j++)
            {
                 System.out.print(" ");
            }
            for(k='A';k<=i;k++)
            {
                 System.out.print(i);
            }

            System.out.print("\n");
        }
        for ( i ='E'; i >='A'; i--) {
            for ( j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for ( k = 'A'; k <= i; k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        
    }
}
