package com.interfaces.interfaceinheritance;

public class Dhiraj implements Test1 {
    @Override
    public void login() {
        System.out.println("this is test1 method");
    }

    @Override
    public void fun() {
        System.out.println("this is test2 method but from where? from Test1 because Test1 extends Test2");
    }

    @Override
    public void register() {
        System.out.println("this is the 2nd method of Test2");
    }

    @Override
    public void play(){
        System.out.println("this is the Test3 method but from where? from Test1.");
    }

    public static void main(String[] args){

    }
}
