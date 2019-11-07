package com.ybq.sbexp.controller;

public class FunctionalTest {

    public static void main(String[] args) {
        //m1(() -> System.out.println("do do do"));
        MyFunctionalInterface m = () -> System.out.println("do do do");
        m.doSome();
    }

    public static void m1(MyFunctionalInterface functionalInterface) {
        functionalInterface.doSome();
    }
}
