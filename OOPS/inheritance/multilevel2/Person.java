package com.inheritance.multilevel2;

public class Person {
    String username;
    int age;
    String address;
    Person(String username, int age, String address){
        this.username=username;
        this.age=age;
        this.address=address;
        showPerson();
    }

    void showPerson(){
        System.out.println("Person Name: " + username);
        System.out.println("Person Age: " + age);
        System.out.println("Person Address: " + address);
    }
}
