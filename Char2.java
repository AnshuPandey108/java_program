public class Char2 {
    public static void main(String[] args) {
        char i,j,k;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                 System.out.print(j);
            }
            System.out.print("\n");
        }
        for(i='E';i>='A';i--)
        {
            for(j='A';j<=i;j++)
            {
                 System.out.print(j);
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
                 System.out.print(k);
            }

            System.out.print("\n");
        }
        for(i='A';i<='E';i++)
        {
            for(j='A';j<i;j++)
            {
                 System.out.print(" ");
            }
            for(k=i;k<='E';k++)
            {
                 System.out.print(k);
            }

            System.out.print("\n");
        }
    }
}
