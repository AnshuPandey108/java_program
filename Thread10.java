class Bank extends Thread
{
    static int bal=5000;
    static int withdraw;
    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public static synchronized void Withdraw()
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+" withdrawn money");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println("Insufficient balance!...");
        }
    }
    public void run()
    {
        Withdraw();
    }
}
public class Thread10 {
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("Raju");
        t2.setName("Manisha");

        Bank obj1=new Bank(5000);
        Thread t3=new Thread(obj1);
        Thread t4=new Thread(obj1);
        t3.setName("Rahul");
        t4.setName("Nainsi");
        t1.start();t2.start();
        t3.start();t4.start();
    }
}
