import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int l,w;
        Scanner r =new Scanner(System.in);
        System.out.println("Enter Rectangle length:");
        l=r.nextInt();
        System.out.println("Enter Rectangle Width:");
        w=r.nextInt();
        System.out.println("Area of Rectangle is:"+(l*w));
    }
    
}
