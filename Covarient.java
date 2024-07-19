class A{
     A show()
     {
        System.out.println("Anshu Pandey: ");
        return this;
     }
}
class B extends A{
      @Override
      B show()
      {
        super.show();
         System.out.println("Perfect Pandey: ");
         return this;
      }
}
public class Covarient {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
