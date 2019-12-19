package com.ybq.sbexp.concurrent;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    @Test
    public void test1() {
        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai);
        System.out.println(ai.get());
        System.out.println(ai.get());
    }

}
