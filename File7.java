import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File7 {
    public static void main(String[] args) throws IOException
    {
        File r=new File("C:\\Users\\Asus\\Desktop\\jmd.txt");
        Scanner sc=new Scanner(r);
        while (sc.hasNextLine()) 
        {
            System.out.println(sc.hasNextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.hasNextLine());
        }
    }
}
