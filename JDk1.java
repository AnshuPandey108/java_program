interface A{
    void a1();
    void a2();
    default void a3()
    {
        System.out.println("May or may not override implementing class: ");
    }
}
class B implements A{
    public void a1()
    {
        System.out.println("Class B a1:");
    }
    public void a2()
    {
        System.out.println("Class B a2:");
    }
    public void a3()
    {
        System.out.println("override in implementing class: ");
    }
}
class C implements A{
    public void a1()
    {
        System.out.println("Class C a1:");
    }
    public void a2()
    {
        System.out.println("Class C a2:");
    }

}
class D implements A{
    public void a1()
    {
        System.out.println("Class D a1:");
    }
    public void a2()
    {
        System.out.println("Class D a2:");
    }

}
public class JDk1 {
    public static void main(String[] args) {
        B b=new B();
        b.a1();b.a2();b.a3();

        C c=new C();
        c.a1();c.a2();c.a3();

        D d=new D();
        d.a1();d.a2();d.a3();
    }
}
