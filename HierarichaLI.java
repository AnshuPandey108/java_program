class A{
    void input()
    {
        System.out.println("Enter Your name: ");
    }
}
class B extends A{
       void show()
       {
        System.out.println("My name is Anshu Pandey");
       }
}
class C extends A{
    void disp()
    {
        System.out.println("My name is Perfect Pandey");
    }
}
public class HierarichaLI {
    public static void main(String[] args) {
        B r=new B();
        C r1=new C();

        r.input(); r.show();
        r1.input(); r1.disp();
    }
    
}
