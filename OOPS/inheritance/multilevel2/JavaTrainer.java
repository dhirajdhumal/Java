package com.inheritance.multilevel2;

public class JavaTrainer extends Trainer {
    String javaTrainerName;
    int javaTrainerId;

    JavaTrainer(String trainerName, int trainerId, String username, int age, String address, String javaTrainerName, int javaTrainerId){
        super(trainerName, trainerId, username, age, address);
        this.javaTrainerName = javaTrainerName;
        this.javaTrainerId = javaTrainerId;
        showJavaTrainer();
    }

    void showJavaTrainer(){
        System.out.println("Java Trainer Name: " + javaTrainerName);
        System.out.println("Java Trainer Id: " + javaTrainerId);
    }

    public static void main(String[] args) {
        new JavaTrainer( "Vrushika",21, "Dhiraj", 22, "Pune","Prathmesh", 22);
    }
}
