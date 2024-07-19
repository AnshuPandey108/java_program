import java.util.Scanner;

class Ascii{
        public static void main(String[] args) {
            char ch;
            System.out.println("Enter charecte:");
            Scanner r= new Scanner(System.in);
            ch=r.next().charAt(0);

            int a=ch;
            System.out.println("Ascii value of "+ch+" is"+a);
        }
    
}