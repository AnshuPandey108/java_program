import java.io.File;

public class File5 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Asus\\Desktop\\jmd.txt");
        File r=new File("C:\\Users\\Asus\\Desktop\\sgn.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("file doesn't exists: ");
        }
        

    }
}
