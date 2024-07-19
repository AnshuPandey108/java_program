import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double Pi=3.14,area;
        int r;
        System.out.println("Enter Circle radius:");
        Scanner obj=new Scanner(System.in);
        r=obj.nextInt();
        area=Pi*r*r;
        System.out.println("Area of Circle is: "+area);

    }
    
}
