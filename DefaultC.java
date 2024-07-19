/**
 * A
 */
class A {
    int a; String b; boolean c;
   A()
   {
      a=100;b="Anshu";c=true;
   }
   void Disp()
   {
    System.out.println(a+"   "+b+"    "+c);
   }
    
}

public class DefaultC {
    public static void main(String[] args) {
       A r=new A();
       r.Disp(); 
    }
}
