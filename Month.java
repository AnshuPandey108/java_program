import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Your month");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        switch (n) {
            case 1:
                System.out.println("Jan=31 days");
                break;
            case 2:
                System.out.println("Feb=28 days");
                break;
            case 3:
                System.out.println("Mar=31 days");
                break;
            case 4:
                System.out.println("Apr=30 days");
                break;
            case 5:
                System.out.println("May=31 days");
                break;
            case 6:
                System.out.println("Jun=30 days");
                break;
            case 7:
                System.out.println("Jul=31 days");
                break;
            case 8:
                System.out.println("Aug=31 days");
                break;
            case 9:
                System.out.println("Sep=30 days");
                break;
            case 10:
                System.out.println("Oct=31 days");
                break;
            case 11:
                System.out.println("Nov=30 days");
                break;
            case 12:
                System.out.println("Dec=31 days");
                break;
            default:
            System.out.println("Invailid input");
                break;
        }
    }
}
