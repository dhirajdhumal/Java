package com.interfaces.fromjava9version;

public interface Test {
    static void m1(){
        System.out.println("Static method");
    }

    private static void m2(){
        m1();
        System.out.println("Private method");
    }

    //default method
    //we need implemented class to call default method;
    default void m3(){
        m2();
        System.out.println("Default method");
    }

    public static void main(String[] args) {

    }
}
