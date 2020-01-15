package com.ybq.sbexp;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("b", "b");
        map.put("a", "a");
        System.out.println(map);

        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");
        System.out.println(set);
        String[] s = {"a", "b"};
        char[] c = {'a', 'b'};
        int[] i = {2, 1};
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);

    }
}
