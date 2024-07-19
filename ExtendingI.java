interface Gill{
   void add();
}
interface Raj extends Gill{
   void sub();
}
public class ExtendingI implements Raj{
    @Override
    public void add()
    {
      int a=10,b=20,c;
      c=a+b;
      System.out.println("Addition is: "+c);
    }
    public void sub()
    {
        int a=30,b=20,c;
        c=b-a;
        System.out.println("Subtraction is: "+c);
    }
    public static void main(String[] args) {
        ExtendingI e=new ExtendingI();
        e.add();e.sub();
    }
}
