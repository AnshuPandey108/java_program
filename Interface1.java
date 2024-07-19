import java.util.Scanner;

interface Client{
    void input();
    void output();
}
public class Interface1 implements Client {
    String name;double sal;
    public void input()
    {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter Username: ");
        name=r.nextLine();

        System.out.println("Enter Salery: ");
        sal=r.nextDouble();
    }
    public void output()
    {
        System.out.println(name+"   "+sal);
    }
    public static void main(String[] args) {
         Client c=new Interface1();
         c.input();c.output();
    }
    
}
