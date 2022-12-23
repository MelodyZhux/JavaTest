package ThreadSample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolSample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) es;
        es.execute(new NumberThread1());
        es.execute(new NumberThread2());
        es.shutdown();

    }
}


class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<=100; i++) {
            if(i%2 ==0)
                System.out.println(Thread.currentThread().getName()+ ":" + i);

        }
    }
}

class NumberThread2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<=100; i++) {
            if(i%2 !=0)
                System.out.println(Thread.currentThread().getName()+ ":" + i);

        }
    }
}