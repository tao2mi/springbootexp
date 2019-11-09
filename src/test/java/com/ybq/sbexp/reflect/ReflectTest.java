package com.ybq.sbexp.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectTest extends SuperReflectTest {
    private String name1 = "ybq";
    public String name2;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Test
    public void test1() {
        ReflectTest t = new ReflectTest();
        Class<ReflectTest> aClass = ReflectTest.class;
        Field[] declaredFields = aClass.getDeclaredFields();
        Field[] fields = aClass.getFields();
        Arrays.stream(declaredFields).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("-------");
        aClass.get
                //https://blog.csdn.net/jiao_zg/article/details/77897748

    }

}
