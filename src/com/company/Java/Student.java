package com.company.Java;

public class Student {
    private int id,age;
    private String name;
    public void setter(int id,int age, String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
