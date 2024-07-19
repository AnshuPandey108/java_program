interface A{
    void show();
}
interface B {
    void disp();
}
public class MultipleI implements A,B {
    public void show()
    {
        System.out.println("Interface A");
    }
    public void disp()
    {
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        MultipleI m=new MultipleI();
        m.show();m.disp();
    }
}
