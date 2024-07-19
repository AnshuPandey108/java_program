import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        char ch,ch1;
        System.out.println("Enter any Charecters:");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            ch1 = Character.toLowerCase(ch);
            System.out.println("LowerCase: "+ch1);
        }
        else {
            ch1 = Character.toUpperCase(ch);
            System.out.println("UpperCase: "+ch1);
        }

    }
}
