package com.interfaces;

public class Demo implements Test{
    @Override
    public void login(){
        System.out.println("Login");
    }

    @Override
    public void email() {
        System.out.println("Email");
    }

    @Override
    public void register(){
        System.out.println("Register");
    }

    public static void main(String[] args) {
//        Demo d = new Demo();
//
//        d.email();
//        d.login();
//        d.register();
//
//        System.out.println(Demo.name);

        //we can pass object of implementation class to the reference interface.
        Test t = new Demo();
        t.login();
    }
}
