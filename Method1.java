public class Method1 {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        Method1 r=new Method1();
        r.Disp();
        Method1.show();

    }
    static void show()
    {
        System.out.println("Show():"+b);
    }
    void Disp()
    {
        System.out.println("Disp(): "+a+"    "+b);
    }
}
