package com.ybq.sbexp.controller;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void t1() {
        String[] s1 = new String[] {};
        String[] s2 = {};
        String[] s3 = new String[3];

        Stream<String> a = Stream.of("a", "b");
        System.out.println(a);
        Stream<String> b = Arrays.stream(new String[]{});
        Stream<String> c = new ArrayList<String>().stream();
        System.out.println(b);
        System.out.println(c);
    }
}
