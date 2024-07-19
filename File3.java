import java.io.*;

public class File3 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Asus\\Desktop\\jmd.txt");
            try {
                fw.write("Java Programming is the best language....!");
            } finally {
                fw.close();
            }
            System.out.println("Successfully wrote data to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
