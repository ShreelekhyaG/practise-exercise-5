package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Parent p=new Child();
        p.get();
        ((Child) p).get2();
    }
}
