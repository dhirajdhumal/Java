package com.methods;

public class Demo {
    //method with no return type and parameters
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition is: " + c);
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.add();
        d.add();

        Demo add =new Demo();
        add.add();
        add.add();
    }
}
