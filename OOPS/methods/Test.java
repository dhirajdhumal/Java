package com.methods;

public class Test {
    //Method no return type and with parameters
    void add(int a, int b){
        int c = a+b;
        System.out.println("Addition is : " +c);
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.add(10,5);
        t.add(25,25);
    }
}
