import java.util.Scanner;

public class CharPrint {
    public static void main(String[] args) {
    char ch;
    System.out.println("Please Enter Character"); 
    Scanner r=new Scanner(System.in);
    ch=r.next().charAt(0);
    System.out.print("Character is: "+ch);

    }
}
