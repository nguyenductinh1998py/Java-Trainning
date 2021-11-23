package JavaThread;

public class CountDownNumber implements Runnable{
    public int intital;

    public CountDownNumber() {
        this.intital = 10;
    }

    public synchronized void startCountDown() throws InterruptedException {
        if(this.intital > 0) {
            Thread.sleep(1000);
            this.intital -= 10;
            System.out.println(this.intital);
        }
        else {
            System.out.println("Number");
        }
    }

    public void run() {
        try {
            startCountDown();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}