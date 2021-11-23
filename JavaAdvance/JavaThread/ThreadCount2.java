package JavaThread;

public class ThreadCount2 extends Thread{
    public void run() {
        for (int i = 5; i > 0; i--) {

            // Thread sleeps every 1000 milliseconds 
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     System.out.println(e);
            // }
            System.out.println("Thread Count 2: " + i);
        }
    }
}
