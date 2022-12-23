package InterviewQuestionSample;

public class ThreadSample1 extends Thread {
    private int counter;
    @Override
    public void run() {
        System.out.println("run");
        System.out.println(this.getName());
        synchronized (this) {
            for(int i = 0; i < 100000; i++)
                counter++;
            System.out.println(counter);
            this.notifyAll();
            System.out.println("Completed COUNTING......");
        }
    }
    public static void main(String[] args) {
        ThreadSample1 t = new ThreadSample1();
        t.start();
        try {
            System.out.println("try");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("waiting to get end ...  ");
        synchronized (t)
        {
            try {
                System.out.println("wait try");
                t.wait();
                System.out.println("wait end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
