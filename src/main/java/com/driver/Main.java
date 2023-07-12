package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setters("Vikalp");
        System.out.println(obj.getter());
    }
}