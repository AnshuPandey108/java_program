import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter a Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while (n>0) {
            n=n/10;
            count++;
        }
        System.out.println("Number of digits is: "+count);

    }
    
}
