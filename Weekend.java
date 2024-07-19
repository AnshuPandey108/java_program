import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        int day;
        System.out.println("Enter days:");
        Scanner r=new Scanner(System.in);
        day=r.nextInt();
        switch(day)
    {
        case 1:
        {
            System.out.println("Sunday");
            break;
        }
        case 2:
        {
            System.out.println("Monday");
            break;
        }
        case 3:
        {
            System.out.println("Tuesday");
            break;
        }
        case 4:
        {
            System.out.println("Wednesday");
            break;
        }
        case 5:
        {
            System.out.println("Thurshday");
            break;
        }
        case 6:
        {
            System.out.println("Friday");
            break;
        }
        case 7:
        {
            System.out.println("Satarday");
            break;
        }
        default:
        {
            System.out.println("Nothing Match"); 
        }
    }
        

    }
}
