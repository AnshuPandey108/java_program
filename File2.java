import java.io.File;

public class File2 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Asus\\Desktop\\Jmd.txt");
        if(f.exists())
        {
            System.out.println("File Name "+f.getName());
            System.out.println("File Location "+f.getAbsolutePath());
            System.out.println("File Writable "+f.canWrite());
            System.out.println("File Readable "+f.canRead());
            System.out.println("File Length "+f.length());
            System.out.println("File Removed "+f.delete());
        }
        else
        {
            System.out.println("File doesn't exists: ");
        }
    }
}
