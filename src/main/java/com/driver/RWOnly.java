package com.driver;

public class RWOnly {
    private static String name;

    public void setters(String name){
         this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
