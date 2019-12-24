package com.ybq.sbexp.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    static CyclicBarrier count = new CyclicBarrier(3);

    public static void main(String[] args) throws Exception {
        Runnable run = () -> {
            System.out.println(Thread.currentThread().getName() + "begin");
            try {
                count.await();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end " + count.getNumberWaiting());
        };
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
//        count.await(50, TimeUnit.MILLISECONDS);
        Thread.sleep(2000);
        System.out.println(count.getNumberWaiting() + "  end");
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
        Thread.sleep(2000);
        System.out.println(count.getNumberWaiting() + "  end");
    }
}
