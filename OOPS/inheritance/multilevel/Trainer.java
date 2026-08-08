package inheritance.multilevel;

public class Trainer extends Person{
    int trainerId;
    String subject;

    Trainer(int trainerId, String subject, String name, int age, String address){
        super(name, age, address);
        this.trainerId = trainerId;
        this.subject = subject;
    }
//    void setTrainerData(int trainerId, String subject, String name, int age, String address){
//        this.trainerId = trainerId;
//        this.subject = subject;
//        super.setPersonData(name, age, address);
//    }

    void showTrainerData(){
        showPersonData();
        System.out.println("Trainer Id: " + trainerId);
        System.out.println("Subject: " + subject);
    }
}
