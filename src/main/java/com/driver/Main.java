package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
//        obj.name="hello"; //name has private access in com.driver.RWOnly
        obj.setName("name");
        System.out.println(obj.getName());
    }
}