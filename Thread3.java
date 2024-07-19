class A extends Thread{
    public void run()
    { 
       String n=Thread.currentThread().getName();
       try
       {
        for(int i=1;i<=3;i++)
        {
           System.out.println(n);
           Thread.yield();
           Thread.sleep(1000);
        }
       }
       catch(InterruptedException e)
       {
        System.out.println(e);
       }
       
    }
}
public class Thread3 {
    public static void main(String[] args) throws InterruptedException
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Anshu");
        t2.setName("Perfect");
        t3.setName("Danger");
        t2.start();
        t2.join();
        t1.start();
        t3.start();
        
        

        String n=Thread.currentThread().getName();
       for(int i=1;i<=3;i++)
       {
          System.out.println(n);
       }
    }
}
