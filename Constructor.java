class A {
    int a; String name;
    // A()
    // {
    //    a=0; name=null; If we not use constructor then it will compiler create own constructor
    // }
    void show()
    {
      System.out.println(a+"   "+name);
    }
}

/**
 * Constructor
 */
public class Constructor {

    public static void main(String[] args) {
        A ref=new A();
        ref.show();
    }
}
