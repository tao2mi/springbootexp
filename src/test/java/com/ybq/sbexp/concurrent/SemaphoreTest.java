package com.ybq.sbexp.concurrent;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    static Semaphore count = new Semaphore(3);

    public static void main(String[] args) throws Exception {
        Runnable run = () -> {
            System.out.println(Thread.currentThread().getName() + "begin");
            try {
                count.acquire();
                Thread.sleep(4000);
                count.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end ");
        };
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
//        count.await(50, TimeUnit.MILLISECONDS);
        Thread.sleep(2000);
        System.out.println(count.availablePermits() + "  end");

    }
}
