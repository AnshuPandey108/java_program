class A
{
    int a;double b; String c;
    // private A()
    // {
    //     a=100;b=32.9;c="Perfect";
    // }
    A()
    {
      a=100;b=45.30;c="Anshu";
    }
    A(int x)
    {
       a=x;
       
    }
    // A(int x,float y)
    // {

    // }
    A(double y,String z)
    {
        b=y;c=z;
        
    }
}

public class OverloadingC {
    public static void main(String[] args) {
        A r=new A();
    A r1=new A(10);
    A r2=new A(23.89,"Pandey");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r1.a);
    System.out.println(r2.b+" "+r2.c);
        
    }
    
}
