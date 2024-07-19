class A {
 int a,b,c;
 void add()
 {
    a=10;b=20;
   c=a+b;
   System.out.println("sum of the two numbers: "+c);
 }
 void sub()
 {
    a=10;b=20;
   c=a-b;
   System.out.println("sub of the two numbers: "+c);
 }
}
class B extends A{
    void mul()
    {
       a=10;b=20;
      c=a*b;
      System.out.println("mul of the two numbers: "+c);
    } 
    void div()
    {
     a=10;b=20;
     c=a/b;
     System.out.println("div of the two numbers: "+c);
   }
}
class C extends B{
    void rem()
    {
       a=10;b=20;
      c=a%b;
      System.out.println("rem of the two numbers: "+c);
    } 
}

public class MultilaveLI {
    public static void main(String[] args) {
        C r=new C();
        r.add(); r.sub(); r.mul(); r.div(); r.rem();
    }
    
}
