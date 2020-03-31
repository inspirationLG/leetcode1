package yibu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
    public void func1() {
        synchronized (this) {
            for (int i = 0; i< 100000;i++) {
                System.out.println(Thread.currentThread().getName()+" "+i + " ");

            }
        }
    }

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
    }
}
