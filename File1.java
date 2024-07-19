import java.io.*;
public class File1 {
    public static void main(String[] args) throws IOException
    {
        File f=new File("C:\\Users\\Asus\\Desktop\\Jmd.txt");
        
            if(f.createNewFile())
        {
            System.out.println("File successfully created..!");
        }
        else
        {
            System.out.println("File already exists..!");
        }

       
    }
}
