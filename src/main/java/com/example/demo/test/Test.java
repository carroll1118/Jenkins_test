package com.example.demo.test;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Test {
    @Getter(name = "/test")
    public void print() {
        System.out.println("-----------------测试1----------");
        System.out.println("-----------------测试2----------");
    }
}
