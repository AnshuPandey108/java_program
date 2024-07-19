public class This {
    This()
    {
        this(10);
    //   System.out.println("Anshu Pandey");
    }
    int a;
    This(int a)
    {
        // this(); It will also work when that this not call
        this.a=a;
        System.out.println("Anshu Pandey");
        
    }
    void show()
    {
        System.out.println(this);
        System.out.println(a);
    }
    public static void main(String[] args) {
        This r=new This(100);
        System.out.println(r);
        r.show();
    }
}
