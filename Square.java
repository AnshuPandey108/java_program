import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int side;
        System.out.println("Enter side of square: ");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();
        System.out.println("Area of square is:"+(side*side));
    }
}
