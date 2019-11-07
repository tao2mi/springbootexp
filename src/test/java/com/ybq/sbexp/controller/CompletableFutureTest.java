package com.ybq.sbexp.controller;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        final int evenNumber = 2 + 4 + 6 + 8 + 10;
        CompletableFuture<Integer> oddNumber = CompletableFuture.supplyAsync(new OddNumberPlus());
        try {
            Thread.sleep(1000);
            System.out.println("0.开始了："+ (System.currentTimeMillis()-startTime) +"秒");
            //看这里，实现回调
            oddNumber.thenAccept(oddNumberResult->
            {
                System.out.println("1.开始了："+ (System.currentTimeMillis()-startTime) +"秒");
                System.out.println("此时计算结果为："+(evenNumber+oddNumberResult));
            });
            System.out.println("=====1");
            oddNumber.get();
            System.out.println("=====2");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
