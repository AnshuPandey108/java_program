class Bus implements Runnable{
    int available = 1, passanger;

    Bus (int passanger) {
        this.passanger = passanger;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is trying to reserve a seat...");
        if(available >= passanger) {
            System.out.println(name + " Reserved Seat! ");
            available = available - passanger;
        } else {
            System.out.println(name + " Sorry No seat available....!");
        }      
    }
}

public class Thread7 {
    public static void main(String[] args) {
        Bus r = new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Raju");

        t1.start();
        t2.start();
        t3.start();
    }
}
