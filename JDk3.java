interface A{
    default void call()
    {
        add(10,20);
    }
    private void add(int x,int y)
    {
        System.out.println("sum of two number is: "+(x+y));
    }
}
class B implements A{
    public void sub(int x, int y)
    {
        System.out.println("Sub of two number is: "+(x-y));
    }
}
public class JDk3 {
    public static void main(String[] args) {
        B b=new B();
        b.call(); b.sub(300, 125);
    }
}
