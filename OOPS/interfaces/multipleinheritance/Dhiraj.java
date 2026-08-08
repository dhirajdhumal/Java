package com.interfaces.multipleinheritance;

import com.interfaces.fromjava9version.Test;

public class Dhiraj implements Test1, Test2 {
    @Override
    public void login() {
        System.out.println("Common Implementation for two interfaces");
    }

    public static void main(String[] args) {
        Dhiraj d = new Dhiraj();
        d.login();

        Test1 t1 = new Dhiraj();
        t1.login();

        Test2 t2 = new Dhiraj();
        t2.login();
    }
}
