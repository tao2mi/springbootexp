package com.ybq.sbexp.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CountRecursiveTask2 extends RecursiveTask<Integer> {

    int start;
    int end;
    int gap;

    public CountRecursiveTask2(int start, int end, int gap) {
        this.start = start;
        this.end = end;
        this.gap = gap;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Integer result = pool.invoke(new CountRecursiveTask2(1, 10000, 50));
        System.out.println(result);
    }

    @Override
    protected Integer compute() {
        if (end - start <= gap) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            int mid = (end + start) / 2;
            CountRecursiveTask2 left = new CountRecursiveTask2(start, mid, gap);
            left.fork();
            CountRecursiveTask2 right = new CountRecursiveTask2(mid + 1, end, gap);
            right.fork();
            return left.join() + right.join();
        }
    }
}


