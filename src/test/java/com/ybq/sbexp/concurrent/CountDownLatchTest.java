package com.ybq.sbexp.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTest {

    static CountDownLatch count = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        Runnable run = () -> {
            System.out.println(Thread.currentThread().getName() + "begin");
            try {
                Thread.sleep(500);
                count.countDown();
                System.out.println(Thread.currentThread().getName() + "end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
//        count.await(50, TimeUnit.MILLISECONDS);
        count.await();
        System.out.println("end");
    }
}
