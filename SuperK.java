class A{
    A(int a){
        System.out.println("Anshu Pandey");
    }
    
}
class B extends A{

    B()
    {
        super(100);
        System.out.println("Perfect Pandey");
    }
    // int a=20;
    // void show()
    // {
    //     System.out.println(a);
    //     System.out.println(super.a);
    // }
}
public class SuperK {
    public static void main(String[] args) {
        B r=new B();
        
    }
}
