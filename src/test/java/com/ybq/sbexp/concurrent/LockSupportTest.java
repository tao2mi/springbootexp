package com.ybq.sbexp.concurrent;

import org.junit.Test;

import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {


    @Test
    public void supportTest() throws InterruptedException {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " begin--");
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " begin2--");
                LockSupport.park();
               LockSupport.park();
                System.out.println(Thread.currentThread().getName() + " end--");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r, "t1");
        //Thread t2 = new Thread(r, "t2");
        t1.start();
//        t2.start();

        Thread.sleep(1000);
       /* LockSupport.unpark(t1);
        LockSupport.unpark(t1);*/
        LockSupport.unpark(t1);
        Thread.sleep(1000);
        LockSupport.unpark(t1);
        //Thread.sleep(5000);
        t1.join();
    }
}
