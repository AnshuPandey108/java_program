import java.util.Scanner;

/**
 * Laep
 */
public class Leap {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter Year");
        Scanner r=new Scanner(System.in);
        year=r.nextInt();
        if(year%4==0)
        {
            System.out.println(year+" is Leap year");
        }
        else
        {
            System.out.println(year+" is not Leap year"); 
        }
    }
}