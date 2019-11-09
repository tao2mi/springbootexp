package com.ybq.sbexp.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectTest extends SuperReflectTest {
    private String name1 = "ybq";
    public String name2 = "yang";

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
    public void test1() throws Exception {
        ReflectTest t = new ReflectTest();
        Class<ReflectTest> aClass = ReflectTest.class;
        Field[] declaredFields = aClass.getDeclaredFields();
        Field[] fields = aClass.getFields();
        /*Arrays.stream(declaredFields).forEach(one -> {
            try {
                System.out.println(one.get(t) + " " + one.getModifiers());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println("-------");
        Arrays.stream(fields).forEach(one -> {
            try {
                System.out.println(one.get(t) + " " + one.getModifiers());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println("-------");*/
        System.out.println("---field----");
        Field f = declaredFields[0];
        System.out.println("getModifiers：" + f.getModifiers());
        System.out.println("getDeclaringClass：" + f.getDeclaringClass());
        System.out.println("getName：" + f.getName());
        System.out.println("isSynthetic：" + f.isSynthetic());
        System.out.println("getGenericType：" + f.getGenericType());
        System.out.println("---field----");


        System.out.println("---method----");
        Method getName1 = aClass.getDeclaredMethod("setName1", String.class);
        System.out.println("getName：" + getName1.getName());
        System.out.println("getDefaultValue：" + getName1.getDefaultValue());

        System.out.println("---method----");



    }

}
