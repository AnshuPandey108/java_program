public class PrivateC {
    int a;double b; String c;
    private PrivateC()
    {
       a=10;b=30.56;c="Anshu";
       System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        PrivateC r=new PrivateC();
    }
}
