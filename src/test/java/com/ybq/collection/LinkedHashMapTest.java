package com.ybq.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

    @Test
    public void test1() {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name1", "josan1");
        hashMap.put("name2", "josan2");
        hashMap.put("name3", "josan3");

        Set<String> keySet = hashMap.keySet();
        Iterator<String> keyIte = keySet.iterator();
        while (keyIte.hasNext()) {
            String key = keyIte.next();
            System.out.println("key:" + key + ",value:" + hashMap.get(key));
        }
        System.out.println("=============");

        Set<Map.Entry<String, String>> set = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
    }

}
