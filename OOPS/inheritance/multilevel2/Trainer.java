package com.inheritance.multilevel2;

public class Trainer extends Person{
    String trainerName;
    int trainerId;

    Trainer(String trainerName, int trainerId, String username, int age, String address){
        super(username, age, address);
        this.trainerName= trainerName;
        this.trainerId= trainerId;
        showTrainer();
    }

    void showTrainer(){
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Trainer Id: " + trainerId);
    }
}
