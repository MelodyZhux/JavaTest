package ThreadSample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableSample {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask<Integer> futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            Integer sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}


class NumThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 1; i<=100; i++) {
            if(i%2 ==0) {
                System.out.println(i);
                sum +=i;
            }
        }
        return sum;
    }
}

