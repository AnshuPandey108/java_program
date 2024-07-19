import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        int sal; double tax;
        System.out.println("Enter your Salery:");
        Scanner r=new Scanner(System.in);
        sal=r.nextInt();
        if(sal<=10000)
        {
            System.out.println("No Tax");
        }
        else if(sal>10000 && sal<=100000)
        {
              tax=sal*0.1;
              System.out.println("salery is: "+sal);
              System.out.println("Tax is: "+tax);
        }
        else
        {
            tax=sal*0.2;
            System.out.println("salery is: "+sal);
            System.out.println("Tax is: "+tax);
        }
    }
    
}
