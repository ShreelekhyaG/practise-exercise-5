package com.company;

public class Child extends Parent{
    int b;
    Child(){
        System.out.println("child cons");
    }
    public void get(){
        System.out.println("child");
    }
    public void get2(){
        System.out.println("child2");
    }
}
