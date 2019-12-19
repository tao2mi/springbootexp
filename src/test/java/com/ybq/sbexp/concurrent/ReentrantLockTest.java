package com.ybq.sbexp.concurrent;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    static Lock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " begin--");
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " begin2--");
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " end--");
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        lock.lock();
        lock.lock();
        lock.lock();
        Thread t1 = new Thread(r, "t1");
        t1.start();

        Thread.sleep(1000);
        lock.unlock();
        lock.unlock();
        lock.unlock();
    }
}
