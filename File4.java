import java.io.FileReader;
import java.io.IOException;

public class File4 {
    public static void main(String[] args) throws IOException
    {

            FileReader r=new FileReader("C:\\Users\\Asus\\Desktop\\jmd.txt");
            
                int i;
                while((i=r.read())!=-1)
                {
                  System.out.print((char)i);
                }
                r.close();
      }
    }

