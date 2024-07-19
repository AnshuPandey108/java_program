class msg{
    public void show(String name)
    {
        ;;;;;;
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are You "+name);
            }
        }
        ;;;;;;
    }
}
class OurThread extends Thread
{
    msg m;
    String name;
    OurThread(msg m,String name)
    {
       this.m=m;
       this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class Thread9 {
    public static void main(String[] args) {
        msg m=new msg();
        OurThread t1=new OurThread(m, "Anshu");
        OurThread t2=new OurThread(m, "Pandey");
        t1.start();t2.start();
    }
}
