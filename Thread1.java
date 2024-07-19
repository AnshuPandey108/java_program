

class A extends Thread{
    @Override
    public void run() 
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
             System.out.println("Anshu Pandey");
             Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
       
    }
}
public class Thread1 {
    public static void main(String[] args) throws InterruptedException
    {
        A t=new A();
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Perfect Pandey");
            Thread.sleep(1000);
        }
    }
}
