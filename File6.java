import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File6 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f= new FileInputStream("C:\\Users\\Asus\\Desktop\\sgn.txt");
        FileOutputStream r= new FileOutputStream("C:\\Users\\Asus\\Desktop\\jmd.txt");
        int i;
        while ((i=f.read())!=-1) 
        {
            r.write((char)i);
        }
        System.out.println("Data copied successfully....!");
    }
}
