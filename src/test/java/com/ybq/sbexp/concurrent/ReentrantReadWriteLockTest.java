package com.ybq.sbexp.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {

    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws Exception {

        new Thread(() -> {
            System.out.println("t0 write lock1");
            lock.writeLock().lock();
            System.out.println("t0 write lock2");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.writeLock().unlock();
            System.out.println("t0 write lock3");
        }).start();

        new Thread(() -> {
            System.out.println("t1 read lock1");
            lock.readLock().lock();
            System.out.println("t1 read lock2");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.readLock().unlock();
            System.out.println("t1 read lock3");
        }).start();

        new Thread(() -> {
            System.out.println("t2 read lock1");
            lock.readLock().lock();
            System.out.println("t2 read lock2");
            lock.readLock().unlock();
            System.out.println("t2 read lock3");
        }).start();

    }
}
