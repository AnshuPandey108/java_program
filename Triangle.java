import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a,b,c,sp;
        double area;
        System.out.println("Enter value for sides of Triange");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Triangle area is:"+area);

    }
    
}
