import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
       int ch;
       System.out.println("Enter any character:"); 
       Scanner r=new Scanner(System.in);
       ch=r.next().charAt(0);

       if(ch== 'a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' || ch== 'A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U')
       {
         System.out.println("vowel");
       }
       else
       {
        System.out.println("consonent");
       }
    }
    
}
