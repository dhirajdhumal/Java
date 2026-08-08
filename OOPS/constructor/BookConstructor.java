package com.constructor;

import java.awt.print.Book;

public class BookConstructor {
    BookConstructor(){
        this(11);
        System.out.println("0 Parameterized Constructor");
    }

    BookConstructor(int i){
        this("Dhiraj", "Dhumal");
        System.out.println("1 Parameterized Constructor");
    }

    BookConstructor(String firstName, String lastName){
        System.out.println("2 Parameterized Constructor");
    }

    public static void main(String[] args) {
        new BookConstructor();
    }
}
