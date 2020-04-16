package com.ybq.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

public class ObjectTest {

    private int name;
    private String hhh;

    public static void main(String[] args) {
        ObjectTest object = new ObjectTest();
        //打印hashcode
        System.out.println(object.hashCode());
        //查看字节序
        System.out.println(ByteOrder.nativeOrder());

        //打印当前jvm信息
        System.out.println(VM.current().details());
        String classLayout = ClassLayout.parseInstance(object).toPrintable();
        System.out.println(classLayout);
    }
}

// IDEA 查看代码反汇编代码
// https://blog.csdn.net/weixin_40739833/article/details/81301577