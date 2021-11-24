package JavaThread;

public class Main {
    public static void main(String[] args) {
        ThreadCount1 t1 = new ThreadCount1();
        Thread t = new Thread(t1);

        ThreadCount2 t2 = new ThreadCount2();

        t.start();
        
        try {
            // Allow thread to run first for 5000 milliseconds
            t.join(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();

        System.out.println("Synchronization ");

        CountDownNumber cn = new CountDownNumber();
        Thread tc = new Thread(cn);
        Thread tc1 = new Thread(cn);

        tc.start();
        tc1.start();
        
    }
}
