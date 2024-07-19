public class Overloading {
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);

    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);

    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);

    }
    public static void main(String[] args) {
        Overloading r=new Overloading();
        r.add();r.add(100,200);r.add(300,25.3);
    }
}
