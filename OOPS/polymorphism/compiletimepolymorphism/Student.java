package com.polymorphism.compiletimepolymorphism;

public class Student {
    void study(int a){
        System.out.println("Student is doing study using Mobile");
    }

    void study(int a, int b){
        System.out.println("Student is doing study using Laptop");
    }

    void study(){
        System.out.println("Student is doing study using Tab");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
        s1.study(11);
        s1.study(22,22);

    }
}
