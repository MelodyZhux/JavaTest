package ThreadSample;

class Window1 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ": sell ticket, number is :" + ticket);
                    ticket--;
                } else break;
            }
        }
    }
}


public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.start();
        t2.start();
        t3.start();

    }

}
